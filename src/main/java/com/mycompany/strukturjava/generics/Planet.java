/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturjava.generics;

/**
 *
 * @author Lenovo
 */
public class Planet {
     private String name;
    private double mass;
    
    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }
    public void print() {
        System.out.println("Planet " + name + ", mass: " + mass);
    }
}
