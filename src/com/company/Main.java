package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i = str.length();
        int no = 0;

        for (int n=0;n<str.length();n++) {

            char simvol_plus = str.charAt(n);

            for (int m = i;m>0;m--) {

                char simvol_minus = str.charAt(m-1);

                if(simvol_plus != simvol_minus){
                    System.out.print("NO");
                    no = 1;
                    break;
                }
                break;

            }
            if (no == 1){
                break;
            }

            i--;
        }

        System.out.print(no!=1 ? "Yes" : "");

    }
}
