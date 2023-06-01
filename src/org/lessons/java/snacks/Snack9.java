// Snack9
// Calcola la somma e la media dei primi 10 numeri.

package org.lessons.java.snacks;

public class Snack9 {
    public static void main(String[] args) {
        int[] intNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        double average;

        // Sum
        for(int i = 0; i < intNumbers.length; i++) {
            sum += intNumbers[i];
        }
        System.out.println("Your sum is " + sum);

        // Average
        average = ((double)sum) / intNumbers.length;
        System.out.println("Your average is " + average);
    }
}
