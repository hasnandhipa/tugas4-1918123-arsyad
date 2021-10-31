package com.example.tugas4_recyclerview;

import android.graphics.drawable.Drawable;

public class Mahasiswa {
    private String nama,nim,angkatan;
    public int gambar;
    public Mahasiswa(String nama, String nim, String angkatan, int gambar){
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
        this.gambar = gambar;
    }
    public int getGambar()
    {
        return gambar;
    }
    public void setGambar(int gambar)
    {
        this.gambar = gambar;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getAngkatan(){
        return angkatan;
    }
    public void setAngkatan(String angkatan){
        this.angkatan = angkatan;
    }
}
