package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int n=0;n<str.length();n++) {

            System.out.print(str.charAt(n));

            if (str.charAt(n) == ' '){
                if (n == str.length()-1) break;
                while (str.charAt(n+1) == ' ') {
                    n++;
                    if (n == str.length()) break;
                }
            }
        }
    }
}
