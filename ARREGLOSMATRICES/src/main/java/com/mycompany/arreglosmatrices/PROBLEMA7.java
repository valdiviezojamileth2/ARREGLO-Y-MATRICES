package com.mycompany.arreglosmatrices;

import java.util.Scanner;

/**
 *
 * @author Jamileth del Rocio Valdiviezo Pushi
 */
public class PROBLEMA7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int suma = 0;

        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Ingrese el valor de la fila " + fila
                        + ", columna " + columna + ": ");

                matriz[fila][columna] = entrada.nextInt();
                suma += matriz[fila][columna];
            }
        }

        System.out.println("Suma total de los elementos: " + suma);

        entrada.close();
    }
}