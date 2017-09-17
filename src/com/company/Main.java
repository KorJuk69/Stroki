package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int slova = 1;

        for (int i=0;i<str.length();i++){

            char simvol = str.charAt(i);
            if (simvol == ' ') slova++;

        }

        System.out.print(slova);

    }
}
