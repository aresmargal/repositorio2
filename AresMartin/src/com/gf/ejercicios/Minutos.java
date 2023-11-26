/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios;

import java.util.Scanner;

/**
 *
 * @author margalar
 */
public class Minutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m;
        
        System.out.println("Introduzca un numero en segundos: ");
        int s = sc.nextInt();
        
        
        m = s/60;
        s = s%60;
        //( m > 59 ) ? (m / 60) 
        
        System.out.println("Son " + m + " minutos y " + s + " segundos");
    }
}
