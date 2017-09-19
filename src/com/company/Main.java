package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k = scanner.nextInt();

        for (int n=0;n<str.length();n++) {

            char simvol = str.charAt(n);
            byte ascii = (byte) simvol;
            ascii -= k;
            if (ascii<65) ascii += 26;
            simvol = (char) ascii;
            System.out.print(simvol);
        }
    }
}
