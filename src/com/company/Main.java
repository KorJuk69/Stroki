package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        char simvol = a.charAt(0);

        int ascii = (int) simvol;

        if(ascii>=97){
            ascii = ascii - 32;
        }

        char bukva = (char) ascii;

        System.out.print(bukva);

    }
}
