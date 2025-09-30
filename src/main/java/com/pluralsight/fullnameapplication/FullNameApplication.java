package com.pluralsight.fullnameapplication;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = myScanner.nextLine();
        System.out.println();

        System.out.print("First name: ");
        String firstName = myScanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = myScanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = myScanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = myScanner.nextLine().trim();

        String fullName = firstName + " " + middleName + " " + lastName + " " + suffix + " ";

        System.out.print("Full name: " + fullName);

        myScanner.close();
    }

    public static String fullName(String first, String middle, String last, String suffix){
       String fullName = first;

        if (!middle.isEmpty()) {
            fullName += " " + middle;
        }

        fullName += " " + last;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }
        return fullName;
    }
}
