package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String napravlenie = "";
        String rasstoyanie = "";
        int x=0;
        int y=0;

        for (int i=0;i<str.length();i++) {

            char simvol = str.charAt(i);
            int ascii = (int)simvol;
            if (ascii==59){

                int rast = Integer.parseInt(rasstoyanie);
                switch (napravlenie){
                    case "North": y += rast;
                        break;
                    case "South": y -= rast;
                        break;
                    case "East": x += rast;
                        break;
                    case "West": x -= rast;
                        break;
                }
                rasstoyanie = "";
                napravlenie = "";

            }
            if (ascii>64) {
                napravlenie += simvol;
            }
            else {
                if ((ascii!=59)&&(ascii!=32)) rasstoyanie += simvol;
            }
        }

        System.out.print(x + " " + y);

    }
}
