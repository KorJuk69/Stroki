package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int yes = 0;
        char bukva = ' ';

        for (int n=0;n<str.length();n++) {

            char simvol1 = str.charAt(n);

            for (int m=1;m<str.length();m++){

                char simvol2 = str.charAt(m);
                if (simvol1==simvol2){
                    bukva = simvol1;
                    yes = 1;
                    break;
                }
            }

            if (yes==1) break;

        }

        System.out.print(bukva);

    }
}
