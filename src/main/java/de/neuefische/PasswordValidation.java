package de.neuefische;

import java.util.Scanner;
import java.util.regex.*;

public class PasswordValidation {

    public static String[] badPassword = {"password123", "PassWord", "HalloWelt!123", "12345678"};

    public static boolean checkBadPassword(String pass) {
        for (String badpass : badPassword) {
            return !badpass.equals(pass);
        }
        return true;
    }
    public static boolean validPassword(String password) {

        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#€$%?!,.]).{8,20}$";

        Pattern pattern = Pattern.compile(regex);
            if (password == null) {
                return false;
            }

        Matcher matcher = pattern.matcher(password);
            return checkBadPassword(password) && matcher.matches();
    }

    public static void main(String[] args) {

        Scanner scanInput = new Scanner(System.in);
        System.out.println("Please ENTER your Password:");
        String passInput = scanInput.nextLine();

        System.out.println(validPassword(passInput));
    }
}

