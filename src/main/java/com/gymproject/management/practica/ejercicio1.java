package com.gymproject.management.practica;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0 ;
        System.out.println("Ingrese dos  numero 1: ");
        int num = sc.nextInt();
        System.out.println("Ingrese dos  numero 2: ");
        int num2 = sc.nextInt();

        suma = num + num2;

        System.out.println("La suma total es: " + suma);
    }
}
