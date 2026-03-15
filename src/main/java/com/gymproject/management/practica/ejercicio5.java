package com.gymproject.management.practica;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = sc.nextInt();


        System.out.println("METODO CRECIENTE");

        for (int i=0; i<num  ;i++){
            System.out.println(i +1);
        }


        System.out.println("METODO DECRECIENTE");

        for (int i=num; i>= 1 ;i--){
            System.out.println(i);
        }


        sc.close();
    }
}
