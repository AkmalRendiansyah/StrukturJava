/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturjava.accessmodifier;

/**
 *
 * @author Lenovo
 */
public class KelasA {
    private int memberA = 5;
    
    char memberB = 'A';
    double memberC = 1.5;
    
    private int functionA() {
        return memberA;
    }
 
    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    } 
}
