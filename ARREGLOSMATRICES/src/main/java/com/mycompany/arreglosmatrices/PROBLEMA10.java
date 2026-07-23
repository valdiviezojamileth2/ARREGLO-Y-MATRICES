package com.mycompany.arreglosmatrices;

import java.util.Scanner;

/**
 *
 * @author Jamileth del Rocio Valdiviezo Pushi
 */
public class PROBLEMA10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int numero;

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print("Ingrese el valor de la fila " + fila
                        + ", columna " + columna + ": ");

                numero = entrada.nextInt();

                matriz[fila][columna] = numero + (fila * columna);
            }
        }

        System.out.println("\nMATRIZ MODIFICADA");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }

            System.out.println();
        }

        entrada.close();
    }
}