/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejemplos;

import java.util.Scanner;

/**
 *
 * @author margalar
 * 
 * Prograna que solicite al usuario el importe de la venta.
 * Se aplicará un descuento en función de este importe: 
 * 
 *      Hasta 5.000€                -> no hay descuento
 *      Entre 5.001 y 10.000€       -> descuento del 5%
 *      Ventas superiores a 10.001€ -> descuento del 7%
 * 
 * Mostrar el importe final de la venta que tiene que pagar el cliente.
 * 
 * (condicion1) ? valor11 :    
 *          (condicion2) ? valor21 : 
 *              (condicion3) ? valor3 : 
 *                      valor32;
 */
public class EjemploTernario2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el importe de la venta: ");
        double importe = sc.nextDouble();
        
        double dto = (importe < 5000) ? 1: (importe >= 5000 && importe < 10000) ? 0.95: 0.93;
        
        System.out.println("El importe final es: " +(importe * dto));
        
        
    }
    
}
