package com.mycompany.arreglosmatrices;

import java.util.Scanner;

/**
 *
 * @author Jamileth del Rocio Valdiviezo Pushi
 */
public class PROBLEMA8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;

        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Ingrese el valor de la fila " + fila
                        + ", columna " + columna + ": ");

                matriz[fila][columna] = entrada.nextInt();
            }
        }

        System.out.println("\nELEMENTOS DE LA DIAGONAL PRINCIPAL");

        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][i]);
            sumaDiagonal += matriz[i][i];
        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);

        entrada.close();
    }
}