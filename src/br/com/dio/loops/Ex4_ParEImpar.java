package br.com.dio.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumbers;
        int number;
        int quantOdds = 0, quantEvens = 0;

        System.out.println("Quantity of numbers: ");
        quantNumbers = scan.nextInt();

        for(int i = 0; i < quantNumbers; i ++) {
            System.out.println("Number: ");
            number = scan.nextInt();

            if(number % 2 == 0) {
                quantEvens ++;
            } else {
                quantOdds ++;
            }
        }

        System.out.println("Quantity of odds: " + quantOdds);
        System.out.println("Quantity of evens: " + quantEvens);
    }
}
