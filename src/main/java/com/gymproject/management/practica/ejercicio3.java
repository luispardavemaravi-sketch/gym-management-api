package com.gymproject.management.practica;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("El numero es par");

        } else{
            System.out.println("El numero es impar");
        }
        sc.close();
    }
}
