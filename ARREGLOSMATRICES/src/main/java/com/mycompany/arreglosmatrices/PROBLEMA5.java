package com.mycompany.arreglosmatrices;

import java.util.Scanner;

/**
 *
 * @author Jamileth del Rocio Valdiviezo Pushi
 */
public class PROBLEMA5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[12];
        int numero;

        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.print("Ingrese un numero positivo para la posicion " + i + ": ");
                numero = entrada.nextInt();

                if (numero <= 0) {
                    System.out.println("El numero debe ser positivo.");
                }

            } while (numero <= 0);

            numeros[i] = numero + i;
        }

        System.out.println("\nARREGLO MODIFICADO");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }

        entrada.close();
    }
}