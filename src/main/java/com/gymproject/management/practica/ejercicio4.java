package com.gymproject.management.practica;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el numero 1: ");
        int num = sc.nextInt();
        System.out.print("Ingresa el numero 2: ");
        int num2 = sc.nextInt();
        System.out.print("Ingresa el numero 3: ");
        int num3 = sc.nextInt();

        int mayor = num ;


        if(num2 > mayor ) {
            mayor = num2;
        }


        if (num3 > mayor) {
                mayor = num3;
        }


        System.out.println("El numero es: "+mayor );

      sc.close();
    }
}
