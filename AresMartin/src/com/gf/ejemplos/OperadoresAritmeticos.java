/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejemplos;

/**
 *
 * @author margalar
 *
 * Ejemplo de creación de expresiones aritméticas
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int i1 = 25;
        int i2 = 12;

        double d1 = 1.2;
        double d2 = 0.4;

        int suma = i1 + i2;  //expresión aritmética de suma de 2 variables

        int resta = i1 - i2;
        int producto = i1 * i2;
        double cociente = (int) (d1 / d2);
        double cociente2 = i1 / (double) i2;
        int resto = i1 % i2;

        System.out.println("Suma: " + suma + "\nResta: " + resta + "\nProducto: " + producto + "\nCociente: "
                + cociente + "\nCociente2: " + cociente2 + "\nResto: " + resto);

        //probamos los operadores incremento y decremento
        int a = 1;
        int b = 2;

        a = a + 1; //incrementamos 'a' una unidad
        a++;
        b = b - 1; //decrementamos 'b' una unidad
        b--;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        //probamos el pre y el post 
        int aa = 2;
        int bb = 3;
        int z = 0;
        //z = aa++; post
        z = ++aa; //pre
        System.out.println("z: " + z);
        System.out.println("aa: " + aa);
        
        //probamos contracciones
        a=a+2;
        a+=2;
        
        b=b*5;
        b*=5;
        
        a=a/b;
        a/=b;
                
    }

}
