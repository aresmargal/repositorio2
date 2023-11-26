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
        int edadcambio = sc.nextInt();

        System.out.println("Tienes carnet de conducir? (S/N)");
        String carnetcambio = sc.next();

        boolean conducir = (edadcambio >= 18) && ("S".equals(carnetcambio) || "s".equals(carnetcambio));
        System.out.println("Puedes conducir (cambio): " + conducir);
    }

}
