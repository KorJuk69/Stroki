package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int dlinna_slova = 0;
        int slovo=0;
        String max_slovo = "";

        for (int i=0;i<str.length();i++){

            char simvol = str.charAt(i);
            dlinna_slova++;

            max_slovo += simvol;
            if (simvol == ' ') {

                dlinna_slova--;
                if(dlinna_slova>slovo){
                    slovo = dlinna_slova;
                    /*max_slovo = "";
                    i = i - dlinna_slova;
                    как-то так
                     */
                }

                dlinna_slova=0;

            }

        }

        System.out.print(slovo);
        System.out.print(max_slovo);

        //Решить проблему с проверкой последнего слова и дописать вывод самого большого слова

    }
}
