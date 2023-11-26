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
 * programa que devuelve el valor ascii del caracter introducido
 */
public class GetASCIICodeFromChar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un caracter: ");
        char caracter = sc.nextLine().charAt(0);
        
        int valor = (int) caracter;
        System.out.println("ASCII: "+valor);
        
    }
    
}
