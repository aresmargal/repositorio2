/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejemplos;

/**
 *
 * @author margalar
 *
 * Ejemplos de asignación entre variables
 */
public class TiposDatos_2 {

    public static void main(String[] args) {

        //variables de tipo entero
        int i1 = 0;
        int i2 = 125;
        byte b1 = 0;
        long l1 = 0;

        i2 = b1; //meto el valor de b1 en i2
        System.out.println(i2);

        b1 = (byte) i1;

        i2 = (int) l1;

        //variables de tipo real
        float f1 = (float) 0.0;
        double d1 = 0.0;

        f1 = (float) d1;
        d1 = f1;

        d1 = i2;

        i1 = (int) d1;

        double nota = 3.25;
        int notaTruncada = (int) nota;
        System.out.println(notaTruncada);

        //nota ="hola"; no hay posibilidad de casting porque son tipos INCOMPATIBLES
        String cp = "47007";
        int cpNumerico = 47007;

        //cp=cpNumerico;
        int codigo;
        char grupo = 'B';

        codigo = grupo;
        System.out.println(codigo);

        grupo = 90; //asigno a la variable char el valor número 90 (ASCII de Z)
        System.out.println(grupo);
        
        //escape de caracteres (\)
        System.out.println("\tHola");
        System.out.println("Hola");
        
        //Mostramos por consola el texto: Para introducir un tabulador usa /t
        System.out.println("Para introducir un tabulador usa \\t");
        
        //Declaramos constantes (mayúsculas)
        final int MESES = 12;
        

    }
}
