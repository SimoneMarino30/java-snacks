// Snack4
// Data in input una stringa verificare se è palindroma

package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insert a word, I'll tell you if it's palindrome:");
        String checkIfPalindrome = scan.nextLine();
        scan.close();
        char[] singleCharsArray = checkIfPalindrome.toCharArray();
        // System.out.print(singleCharsArray);

        boolean isPalindrome = true;

        for(int i = 0; i < singleCharsArray.length / 2; i++) {
            if(singleCharsArray[i] !=  singleCharsArray[singleCharsArray.length - 1 - i]) {
                isPalindrome = false;
                break;
                //System.out.println("Your word isn't a palindrome");
            }
        }

        if(!isPalindrome) {
            System.out.println("Your word isn't a palindrome");
        } else {
            System.out.println("Your word is a palindrome");
        }


    }
}
