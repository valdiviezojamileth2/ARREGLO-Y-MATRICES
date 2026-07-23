package com.mycompany.arreglosmatrices;

import java.util.Scanner;

/**
 *
 * @author Jamileth del Rocio Valdiviezo Pushi
 */
public class PROBLEMA6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Ingrese el valor de la fila " + fila
                        + ", columna " + columna + ": ");

                matriz[fila][columna] = entrada.nextInt();
            }
        }

        System.out.println("\nMATRIZ");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }

            System.out.println();
        }

        entrada.close();
    }
}