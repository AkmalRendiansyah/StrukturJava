/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturjava.inheritance;

/**
 *
 * @author Lenovo
 */
public class MainHewan1 {
      public static void main(String[] args) {
        Hewan1 hewan = new Hewan1(); // memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan1));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));
        System.out.println("------------------------");
        Kucing kucing = new Kucing(); // memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan1));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing));
       System.out.println("------------------------");
 
        // kucing mewarisi metode makan() dari parent class Hewan
        hewan.makan();
        kucing.makan();
        kucing.makan("daging ikan");
         System.out.println("------------------------");
 
        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");
        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());
        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));
    
        System.out.println("------------------------");
        Object o = new Kucing(); // kucing adalah Object
        Hewan1 h = new Kucing(); // kucing adalah Hewan
        Kucing k = new Kucing(); // kucing adalah Kucing, pastinya :)
        
        //o.makan(); -> error, karena method makan() tidak ada di class Object
        h.makan();
        k.makan();
        Object object = k; // bisa langsung diassign
        Hewan1 hewanK= k; // bisa langsung diassign
        //object.makan(); -> error, karena method makan() tidak ada di class Object
        hewanK.makan();
        Kucing kucingK = (Kucing) h; // tidak bisa langsung diassign, perlu casting
        kucingK.makan();
        
        Hewan1 harimau = new Hewan1();
        Kucing anggora = (Kucing) harimau; // compile OK tetapi runtime error ClassCastException
    }
}
