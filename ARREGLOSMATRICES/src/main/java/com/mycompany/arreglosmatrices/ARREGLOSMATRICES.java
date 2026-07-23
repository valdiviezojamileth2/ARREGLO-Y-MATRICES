package com.mycompany.arreglosmatrices;

import java.util.Scanner;

/**
 *
 * @author Jamileth del Rocio Valdiviezo Pushi
 */
public class ARREGLOSMATRICES {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero de la posicion " + i + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("\nVALORES ALMACENADOS");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }

        entrada.close();
    }
}