package com.company;
import java.util.Scanner;
public class leetTranslator {

    public static void main(String[] args) {
        String[] input = {"A", "B", "C", "E", "G", "H", "I", "L", "O", "S", "T", "Z"};
        String[] output = {"@", "8", "(", "3", "6", "#", "!", "1", "0", "$", "7", "2"};

        //scans user input
        Scanner textIn = new Scanner(System.in);

        System.out.println("Bitte gebe den Text zum übersetzen ein (nur Großbuchstaben):");


        String text = textIn.nextLine();
        //replaces characters
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (j == i) {
                    text = text.replaceAll(input[i], output[i]);
                    }
            }
        }
        //gives out the translated string
        System.out.println("Hier der Text in l33t:");
        System.out.println(text);
    }
}
