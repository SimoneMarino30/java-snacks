// Snack3
// Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

package org.lessons.java.snacks;

public class Snack3 {
    public static void main(String[] args) {

        int[] intNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int sum = 0;

        for(int i = 0; i < intNumbers.length; i++) {
            if(i % 2 != 0) {
                sum += intNumbers[i];
                // System.out.println(intNumbers[i]);
            }
        }

        System.out.println("Your odd numbers' sum is " + sum);
    }
}
