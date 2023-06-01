// Snack8
// Chiedi un numero di 4 cifre all’utente e calcola la somma di tutte le cifre che compongono il numero

package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean fourDigitsNumber = false;
        int numberInserted;
        int sum = 0;

        do {
            System.out.print("Insert a 4 digits number: ");
            numberInserted = scanner.nextInt();
            if (numberInserted > 999 && numberInserted < 10000) {
                fourDigitsNumber = true;
            } else {
                System.out.println("You need a 4 digits number to continue");
            }
        } while (!fourDigitsNumber);

        System.out.println("your number is: " + numberInserted);

        int firstDigit = (numberInserted / 1000 % 10);
        int secondDigit = (numberInserted / 100 % 10);
        int thirdDigit = (numberInserted / 10 % 10);
        int fourthDigit = (numberInserted % 10);

        sum += firstDigit + secondDigit + thirdDigit + fourthDigit;
        System.out.println("The sum between each single digit is: " + sum);
        scanner.close();

    }
}
