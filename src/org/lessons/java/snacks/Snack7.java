// Snack 7
// Scrivere un programma che
// dati dei secondi
// li converta in ore, minuti, secondi
// e mostri a video la stringa generata (secondi → “hh:mm:ss”)

package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci il numero di secondi da convertire: ");
        int totSeconds = scan.nextInt();

        int hours;
        int minutes;
        int seconds;

        hours = totSeconds / 3600;
        minutes = (totSeconds % 3600) / 60;
        seconds = totSeconds % 60;
        System.out.println("secondi-> "+ hours + ":" + minutes + ":" + seconds );
    }
}
