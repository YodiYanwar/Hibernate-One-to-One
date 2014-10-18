package com.yodiyanwar.model;

/**
 *
 * @author Yodi Yanwar
 */
public class Alamat {
    private long alamatId;
    private String namaJalan;
    private String kota;
    private String provinsi;
    private String kodePos;

    public Alamat(String namaJalan, String kota, String provinsi, String kodePos) {
        this.namaJalan = namaJalan;
        this.kota = kota;
        this.provinsi = provinsi;
        this.kodePos = kodePos;
    }

    
    public long getAlamatId() {
        return alamatId;
    }

    public void setAlamatId(long alamatId) {
        this.alamatId = alamatId;
    }

    public String getNamaJalan() {
        return namaJalan;
    }

    public void setNamaJalan(String namaJalan) {
        this.namaJalan = namaJalan;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }
    
    
}
