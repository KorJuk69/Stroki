package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        i--;
        j--;

        for (int n=0;n<i;n++) System.out.print(str.charAt(n));

        for (int n=j-1;n>=i-1;n--) System.out.print(str.charAt(n+1));

        for (int n=j+1;n<str.length();n++) System.out.print(str.charAt(n));
    }
}
