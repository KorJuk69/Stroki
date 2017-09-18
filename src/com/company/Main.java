package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int dlinna_slova = 0;
        int max_slovo_int=0;
        String max_slovo_string = "";
        String max_slovo = "";

        for (int i=0;i<str.length();i++){

            char simvol = str.charAt(i);
            dlinna_slova++;

            max_slovo += simvol;
            if (simvol == ' ') {

                dlinna_slova--;
                if(dlinna_slova>max_slovo_int){
                    max_slovo_int = dlinna_slova;
                    max_slovo_string = max_slovo;
                    i = i - (dlinna_slova + 1);
                }

                dlinna_slova=0;
                max_slovo = "";

            }
        }

        System.out.println(max_slovo_int);
        System.out.print(max_slovo_string);

    }
}
