package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String podstr = scanner.nextLine();
        String str = scanner.nextLine();
        int yes = 0;
        int ravnost=0;

        for (int n=0;n<str.length();n++) {

            char simvol_str = str.charAt(n);

            for (int m=ravnost;m<podstr.length();m++) {

                char simvol_podstr = podstr.charAt(m);

                if (podstr.charAt(podstr.length()-1) == simvol_str){

                    System.out.print("Yes");
                    yes = 1;
                    break;

                }
                if (simvol_podstr != simvol_str) {

                    ravnost = 0;
                    break;

                }
                else {
                    ravnost++;
                    break;
                }
            }

            if (yes==1) break;

            if (str.length()-n<podstr.length()){
                System.out.print("NO");
                break;
            }
        }
    }
}
