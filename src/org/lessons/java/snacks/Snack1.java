// Snack1
// Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

package org.lessons.java.snacks;

// Import scanner
import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero:");
        int numeroInserito = scanner.nextInt();

        if(numeroInserito % 2 == 0) {
            System.out.println(numeroInserito);
        } else {
            System.out.println(numeroInserito + 1);
        }

    }
}
