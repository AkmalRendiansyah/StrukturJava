/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturjava.array;

/**
 *
 * @author Lenovo
 */
public class IndexOutOfBound {
    public static void main(String[] args) {
        int[] arrA = {1, 2, 3, 4};
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);
        // Akses indeks ke 4
        //System.out.println(arrA[4]);
        //error karna indek hanya ada samapai 3 dihitung dari 
        //0,1,2,3
    }
}
