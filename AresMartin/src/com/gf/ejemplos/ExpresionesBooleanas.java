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
 * Ejemplo de creación de expresiones booleanas con operadores relaciones
 */
public class ExpresionesBooleanas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        boolean resultado = (edad >= 18);
        System.out.println("Eres mayor de edad? " + resultado);

        boolean mayorEdad = (edad == 18);

        //probamos operadores lógicos && || !
        boolean ej1 = true && true;
        boolean ej2 = false || true;
        boolean ej3 = !false;
        ej3 = !ej3;

        System.out.println("ej1: " + ej1 + "\nej2: " + ej2 + "\nej3: " + ej3); //true true false

    }

}
