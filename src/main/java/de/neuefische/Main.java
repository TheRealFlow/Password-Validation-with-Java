package de.neuefische;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int MAX=8;

        final int MIN_Uppercase=2;
        final int MIN_Lowercase=3;
        final int NUM_Digits=2;
        final int Special=1;
        int uppercaseCounter=0;
        int lowercaseCounter=0;
        int digitCounter=0;
        int specialCounter=0;

        System.out.println("Enter the password\n");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        for (int i=0; i < password.length(); i++ ) {
            char c = password.charAt(i);
            if(Character.isUpperCase(c))
                uppercaseCounter++;
            else if(Character.isLowerCase(c))
                lowercaseCounter++;
            else if(Character.isDigit(c))
                digitCounter++;
            if(c>=33&&c<=46||c==64){
                specialCounter++;
            }
        } if (password.length() >= MAX && uppercaseCounter >= MIN_Uppercase
                && lowercaseCounter >= MIN_Lowercase && digitCounter >= NUM_Digits && specialCounter >= Special) {
            System.out.println(password + " is a valid Password");
        }
          else {
            System.out.println("Your Password should have the following:");
            if(password.length() < MAX)
                System.out.println("Minimum 8 characters");
            if (lowercaseCounter < MIN_Lowercase)
                System.out.println("Minimum 2 lowercase letters");
            if (uppercaseCounter < MIN_Uppercase)
                System.out.println("Minimum 2 uppercase letters");
            if(digitCounter < NUM_Digits)
                System.out.println("Minimum 2 digits");
            if(specialCounter < Special)
                System.out.println("Minimum 1 special characters");
            }
        }
    }

