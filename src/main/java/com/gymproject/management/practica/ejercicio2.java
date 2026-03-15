package com.gymproject.management.practica;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        System.out.println("========= MENU ========");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        System.out.println("ELIJA SU OPCCION ");
        int opcion = sc.nextInt();
        System.out.println("Ingresa el numero 1: ");
        double numero1 = sc.nextDouble();
        System.out.println("Ingresa el numero 2: ");
        double numero2 = sc.nextDouble();
        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                    case 3:
                        resultado = numero1 * numero2;
                        break;
                        case 4:
                            if (numero2 != 0) {
                                resultado = numero1 / numero2;
                            } else {
                                System.out.println("No se puede dividir entre 0");
                            }
                            break;

            default:
                System.out.println("error");


        }
        System.out.println("El resultado es: " + resultado);
        sc.close();
    }

}
