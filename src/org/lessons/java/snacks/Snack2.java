// Snack2
// Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
// e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

package org.lessons.java.snacks;

// import random
import java.util.Random;

public class Snack2 {

    public static void main(String[] args) {
        String[] names = {"Mario", "Marco", "Antonio", "Leonardo", "Anna"};
        String[] surnames = {"Rossi", "Verdi", "Bianchi", "DiCaprio", "Gialli"};


        Random random = new Random();

        for (int i = 0; i < names.length; i++) {
            String fullName = names[random.nextInt(names.length)] + " " + surnames[random.nextInt(surnames.length)];
            System.out.println(fullName);
        }
    }
}