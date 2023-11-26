/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejemplos;

/**
 *
 * @author margalar
 *
 * En esta clase se ven ejemplos de declaración de variables de distintos tipos
 */
public class TiposDatos {

    public static void main(String[] args) {

        //declaramos variables para almacenar números enteros 
        int edad;
        long habitantes;
        
        // short s2=35000; incorrecto, hacer casting a short short s2=(short)35000
        byte b2=(byte) 130;

        //doy valores a estas variables 
        edad = 0;
        habitantes = 0;

        edad = 18;
        habitantes = 525000;

        System.out.println(edad);
        System.out.println(habitantes);

        //declaramos variables para almacenar números reales o con parte decimal
        double saldoCuenta = 0.0;
        float estatura = (float) 0.0; //en metros 
        float nota = 6.5F;
        
        float f=(float)1.0;

        saldoCuenta = 1000.8;
        estatura = 1.83F;
        nota = 5.5F;

        //declaramos variables de tipo lógico 
        boolean cierto = true;
        boolean terminado = false;
        boolean salir = true;

        //declaramos variables de tipo caracter (UN SOLO CARACTER)
        char letra;
        letra = 'a';
        char grupo = 'B';

        //declaramos variables de tipo cadena de caracteres (UNO O MÁS CARACTERES)
        String nombre ="Pepe";
        String apellidos="Perez";
        String dni="132456789A";

    }
}
