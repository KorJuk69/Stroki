package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        boolean IsDigit = a.matches("[-+]?\\d+");

        if(IsDigit){

            System.out.print("yes");

        }
        else {

            System.out.print("no");

        }
    }
}
