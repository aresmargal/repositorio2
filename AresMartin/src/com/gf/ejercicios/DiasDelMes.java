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
public class DiasDelMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero de mes: ");
        int n = sc.nextInt();
        
        int ndias = (n == 2) ? 28 : 
                (n == 1 || n== 3 || n==5 || n==7 || n==8 || n==10 || n==12) ? 31: 
                (n == 4 || n== 6 || n== 9 || n== 11 ) ? 30:
                -1;
        
       // String mensajeSalida = ( ndias == -1) ? "ERROR. Mes fuera del rango [1,12]." : 
       //         "Este mes tiene" + ndias+ "dias.";
      
        System.out.println("El mes tiene " +ndias+ " dias");
    }
}
