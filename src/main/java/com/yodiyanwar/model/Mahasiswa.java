package com.yodiyanwar.model;

/**
 *
 * @author Yodi Yanwar
 */
public class Mahasiswa {
    private long npm;
    private String nama;
    private Alamat alamat;

    public Mahasiswa(String nama, Alamat alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public long getNpm() {
        return npm;
    }

    public void setNpm(long npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
    
    
}
