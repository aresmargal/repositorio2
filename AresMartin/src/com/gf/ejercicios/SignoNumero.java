/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios;

import java.util.Scanner;

/**
 *
 * @author margalar
 * 
 * (condicion1) ? valor11 :    
 *          (condicion2) ? valor21 : 
 *              (condicion3) ? valor3 : 
 *                      valor32;
 */
public class SignoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Introduzca un numero entero: ");
        int n = sc.nextInt();
        
        String resultado= (n > 0) ? "positivo": (n < 0) ? "negativo": "nulo";
        
        System.out.println("El numero es: " +resultado);
        
        
        
    }
    
}
