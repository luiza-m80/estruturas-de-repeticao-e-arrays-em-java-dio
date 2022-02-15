package br.com.dio.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int media;
        int sum = 0;
        int bigger = 0;
        int count = 0;

        do {
            System.out.println("Number: ");
            number = scan.nextInt();

            sum += number;

            if(number > bigger) {
                bigger = number;
            }

            count += 1;
        } while(count < 5);

        media = (sum)/ 5;

        System.out.println("The biggest number is: " + bigger);
        System.out.println("The sum is: " + sum);
        System.out.println("The media is: " + media);
    }
}
