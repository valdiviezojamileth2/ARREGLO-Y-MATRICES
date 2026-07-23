package com.mycompany.arreglosmatrices;

import java.util.Scanner;

/**
 *
 * @author Jamileth del Rocio Valdiviezo Pushi
 */
public class PROBLEMA2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] numeros = new double[10];
        double suma = 0;
        double promedio;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();

            suma += numeros[i];
        }

        promedio = suma / numeros.length;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

        entrada.close();
    }
}