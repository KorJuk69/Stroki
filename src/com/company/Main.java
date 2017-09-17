package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        boolean Compare = str1.equals(str2);

        System.out.print(Compare ? "yes" : "no");

    }
}
