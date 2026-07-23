package com.mycompany.arreglosmatrices;

import java.util.Scanner;

/**
 *
 * @author Jamileth del Rocio Valdiviezo Pushi
 */
public class PROBLEMA4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[20];
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] % 2 == 0) {
                cantidadPares++;
                sumaPares += numeros[i];
            } else {
                cantidadImpares++;
                sumaImpares += numeros[i];
            }
        }

        System.out.println("Cantidad de numeros pares: " + cantidadPares);
        System.out.println("Cantidad de numeros impares: " + cantidadImpares);
        System.out.println("Suma de los numeros pares: " + sumaPares);
        System.out.println("Suma de los numeros impares: " + sumaImpares);

        entrada.close();
    }
}