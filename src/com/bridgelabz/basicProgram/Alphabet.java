package com.bridgelabz.basicProgram;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the Alphabet");
        char c = scan.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("Given Alphabet is VOWEL");
        } else {
            System.out.println("Given Alphabet is CONSONANT");
        }
    }
}

