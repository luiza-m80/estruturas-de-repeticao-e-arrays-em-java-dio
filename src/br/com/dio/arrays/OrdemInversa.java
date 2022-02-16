package br.com.dio.arrays;

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, 1, 2, 3, 4, 5, 50, 68};
        int count = 0;

        System.out.println("VETOR ");

        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.println(vetor[i]);
        }
    }
}
