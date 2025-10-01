package com.pluralsight.fullnameapplication;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your name:      ");
        String name = myScanner.nextLine();
        System.out.println();

        System.out.print("First Name: ");
        String firstName = myScanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = myScanner.nextLine().trim();

        System.out.println(name);
    }
}
