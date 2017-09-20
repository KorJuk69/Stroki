package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int b = str.length()-1;


        for (int n=0;n<str.length();n++) {

            char simvol_plus = str.charAt(n);

            for (int m = b;m<str.length() + n;m--) {

                char simvol_minus = str.charAt(m);

                if (simvol_minus == simvol_plus) {
                    b = m-1;
                    break;
                }
                else {
                    /*if () {  Хз как его делать
                        b = m-1;
                    }
                    else b = str.length()-1;*/
                }
            }
        }
    }
}
