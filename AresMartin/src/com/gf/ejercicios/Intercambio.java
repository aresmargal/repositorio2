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
public class Intercambio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n3 =0;
        
        System.out.println("Introduzca el primer numero: ");
        int n1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int n2 = sc.nextInt();
        
        System.out.println("El valor antes de n1 era: "+n1+"\nEl valor antes de n2 era: " +n2);
        
        n3=n2;
        n2=n1;
        n1=n3;
       
        
        System.out.println("El valor despues de n1 es: " +n1+ "\nEl valor despues de n2 es: " +n2);
        
    }
    
}
