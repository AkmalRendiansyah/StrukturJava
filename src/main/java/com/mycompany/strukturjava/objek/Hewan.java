/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturjava.objek;

/**
 *
 * @author Lenovo
 */
public class Hewan {

   String nama;
    int berat;
    int jumlahKaki;
    // Ini merupakan konstruktor dari kelas hewan. konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.
    public Hewan(String namaHewan) {
        nama = namaHewan;
    }
    public void beratHewan(int beratHewan) {
        berat = beratHewan;
    }
    public void jumlahKakiHewan(int jumlahKakiHewan) {
        jumlahKaki = jumlahKakiHewan;
    }
 
    public void cetakHewan() {
        System.out.println("Nama hewan : " + nama);
System.out.println("Berat hewan : " + berat + " kg");
        System.out.println("Jumlah kaki: " + jumlahKaki);
    } 
}
