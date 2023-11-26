/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejemplos;

import java.util.Scanner;

/**
 *
 * @author margalar
 */
public class EjemploConducir {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Edad: ");
        int edad = sc.nextInt();

        System.out.println("Tienes carnet de conducir? (S/N)");
        String carnet = sc.next();

        boolean conducir = (edad >= 18) && ("S".equals(carnet) || "s".equals(carnet));
        System.out.println("Puedes conducir: " + conducir);
    }

}
