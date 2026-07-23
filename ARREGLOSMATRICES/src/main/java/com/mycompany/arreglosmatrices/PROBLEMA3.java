package com.mycompany.arreglosmatrices;

import java.util.Scanner;

/**
 *
 * @author Jamileth del Rocio Valdiviezo Pushi
 */
public class PROBLEMA3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[15];
        int mayor;
        int menor;
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero de la posicion " + i + ": ");
            numeros[i] = entrada.nextInt();
        }

        mayor = numeros[0];
        menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posicionMayor = i;
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
                posicionMenor = i;
            }
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Posicion del numero mayor: " + posicionMayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Posicion del numero menor: " + posicionMenor);

        entrada.close();
    }
}