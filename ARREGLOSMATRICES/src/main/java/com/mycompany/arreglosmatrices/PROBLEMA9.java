package com.mycompany.arreglosmatrices;

import java.util.Scanner;

/**
 *
 * @author Jamileth del Rocio Valdiviezo Pushi
 */
public class PROBLEMA9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int mayor;
        int menor;

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print("Ingrese el valor de la fila " + fila
                        + ", columna " + columna + ": ");

                matriz[fila][columna] = entrada.nextInt();
            }
        }

        mayor = matriz[0][0];
        menor = matriz[0][0];

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {

                if (matriz[fila][columna] > mayor) {
                    mayor = matriz[fila][columna];
                }

                if (matriz[fila][columna] < menor) {
                    menor = matriz[fila][columna];
                }
            }
        }

        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);

        entrada.close();
    }
}