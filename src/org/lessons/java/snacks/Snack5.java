// Snack5
//Data una stringa in input mostrare a video
// quanti caratteri alfabetici contiene,
// quanti numeri e
// quanti simboli non alfanumerici.
// Continuare a chiedere una nuova stringa finchè non si inserisce 0.

package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {

        // Creazione dell'oggetto Scanner per leggere l'input dell'utente
        Scanner scan = new Scanner(System.in);
        // Dichiarazione della variabile per memorizzare l'input dell'utente (dentro il ciclo do)
        String userString;

        do{
            System.out.print("inserisci una stringa o premi 0 per terminare il programma:  ");
            // Lettura dell'input dell'user
            userString = scan.nextLine();



            // Se userString NON è 0, allora...
            if(!(userString.equals("0"))) { // RICORDARSI DOPPI APICI NELL' EQUALS !!!!!
                // Dichiarazione delle variabili contatore
                int isChar = 0;
                int isNumber = 0;
                int isSymbol = 0;

                // Ciclo for per iterare sui caratteri della stringa
                for (int i = 0; i < userString.length() ; i++) {

                    //  Rendi minuscolo e verifica se il carattere corrente è alfabetico
                    if(userString.toLowerCase().charAt(i)  >= 'a' && userString.toLowerCase().charAt(i) <= 'z') {
                        isChar++;
                        // System.out.println("e' un carattere: " + isChar);

                      // Verifica se il carattere corrente è un numero
                    } else if(userString.charAt(i)  >= '0' && userString.charAt(i) <= '9') {
                        isNumber++;
                        // System.out.println("e' un numero: " + isNumber);

                      // Il carattere corrente è un simbolo non alfanumerico
                    } else {
                        isSymbol++;
                        // System.out.println("e' un simbolo: " + isSymbol);
                    }
                }
                System.out.println("La tua stringa contiene " + isChar + " caratteri " + isNumber + " numeri e "  + isSymbol + " simboli");
            } else {
                // allo zero mostro il messaggio di fine programma
                System.out.println("Hai terminato il programma");
            }

            // Continua il ciclo finché userString non è "0"
        } while (!(userString.equals("0"))); // RICORDARSI DOPPI APICI NELL' EQUALS !!!!!
    }
}
