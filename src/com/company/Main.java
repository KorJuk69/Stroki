package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int dlinna_slova = 0;
        int slovo=0;

        for (int i=0;i<str.length();i++){

            char simvol = str.charAt(i);
            dlinna_slova++;
            if (simvol == ' ') {

                dlinna_slova--;
                if(dlinna_slova>slovo) slovo = dlinna_slova;

                dlinna_slova=0;

            }

        }

        System.out.print(slovo);

        //Решить проблему с проверкой последнего слова и дописать вывод самого большого слова

    }
}
