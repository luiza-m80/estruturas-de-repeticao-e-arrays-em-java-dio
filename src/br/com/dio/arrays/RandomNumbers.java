package br.com.dio.arrays;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i ++) {
            int numero = random.nextInt(100);

            numerosAleatorios[i] = numero;
        }

        System.out.println("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero);
        }

        System.out.println("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero + 1));
        }

        System.out.println("\nAntecessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero - 1));
        }
    }
}
