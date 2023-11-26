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
 * Ejemplos de uso del operador ternario ? cuya sintaxis es:
 *
 * variable = (condición) ? valor : valor 2;
 */
public class EjemploTernario {

    public static void main(String[] args) {

        //pedimos al usuario una nota y si es mayor que 5 
        //mostramos "APROBADO", sino mostramos "SUSPENSO"
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Nota: ");
//        double nota = sc.nextDouble();
//
//        String resultado = (nota >= 5) ? "APROBADO" : "SUSPENSO";
//        System.out.println("Evaluacion: " + resultado);


        //pedimos al usuario el saldo de su cuenta 
        //si es mayor de 1000€ no se le aplica comisión, 
        //en caso contrario tiene una comisión del 2%.
        //Hay que mostrar al usuario su saldo final. 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu saldo: ");
        double saldo = sc.nextDouble();
        
        double comision = (saldo > 1000) ? 1 :0.98; //si es true se devuelve 1, si es false se devuelve 
  
        
        System.out.println("Saldo final: " + (saldo * comision));
    }

}
