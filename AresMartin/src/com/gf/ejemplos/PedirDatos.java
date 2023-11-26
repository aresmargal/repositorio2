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
 * Ejemplo de petición de datos de distintos tipos al usuario, para que los meta
 * a través del teclado.
 */
public class PedirDatos {

    public static void main(String[] args) {

        //creamos el objeto Scanner para acceder al teclado
        //se crea 1 vez 
        //se usa las veces necesarias
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine(); //nextLine recoge todos los caracteres introducidos

        System.out.print("Introduce tus apellidos: ");
        String apellidos = sc.nextLine(); //next recoge los caracteres hasta que haya un espacio, cambiado a "nexLine" 
        //para que recoja ambos apellidos al tener otro dato después

        System.out.print("Introduce tu edad:");
        int edad = sc.nextInt();

        System.out.print("Has introducido el nombre " + nombre + " los apellidos " + apellidos + " y la edad " + edad);

    }
}
