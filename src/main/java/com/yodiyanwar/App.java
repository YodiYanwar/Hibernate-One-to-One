package com.yodiyanwar;

import com.yodiyanwar.model.Alamat;
import com.yodiyanwar.model.Mahasiswa;
import com.yodiyanwar.util.HibernateUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    
    private static String namaJalan;
    private static String kota;
    private static String provinsi;
    private static String kodePos;
    
    private static String nama;
    
    public static void main( String[] args ){
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        
        try {
            tx = sesion.beginTransaction();
            
            System.out.print("\n==Mahasiswa==\n");
            System.out.println("Masukan Nama Mahasiswa : "); nama = in.readLine();
            
            System.out.print("\n==Alamat==\n");
            System.out.print("Masukan Nama Jalan    : "); namaJalan = in.readLine();
            System.out.print("Masukan Nama Kota     : "); kota = in.readLine();
            System.out.print("Masukan Nama Provinsi : "); provinsi = in.readLine();
            System.out.print("Masukan Kode Pos      : "); kodePos = in.readLine();
            
            Alamat alamat1 = new Alamat(namaJalan,kota,provinsi,kodePos);
            Mahasiswa mhs1 = new Mahasiswa(nama, alamat1);
            
            sesion.save(mhs1);
            tx.commit();
            
            System.out.println(nama+" Berhasil Disimpan !");
            System.exit(0);
        } catch (HibernateException he) {
            System.out.println(nama+" Gagal Disimpan !");
            tx.rollback();
            he.printStackTrace();
        } catch (IOException e) {
            System.out.println("Terjadi Kesalahan input !\n"+e.getMessage());;
            e.printStackTrace();
        } finally{
            sesion.close();
        }
    }
}
