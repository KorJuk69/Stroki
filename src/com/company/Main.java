package com.company;

import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Matcher matcher = pattern.matcher(str);
        if (matcher.matches())
            System.out.print(1);
        else
            System.out.print(0);
    }
}
