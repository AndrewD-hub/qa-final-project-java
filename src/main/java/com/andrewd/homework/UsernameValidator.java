package com.andrewd.homework;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean validUsername;

        do {
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();
            validUsername = true;

            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                validUsername = false;
            } else {
                boolean hasDigit = false;
                boolean hasSpace = false;

                for (int i = 0; i < username.length(); i++) {
                    char currentChar = username.charAt(i);

                    if (currentChar == ' ') {
                        hasSpace = true;
                        break;
                    }

                    if (currentChar >= '0' && currentChar <= '9') {
                        hasDigit = true;
                    }
                }

                if (hasSpace) {
                    System.out.println("Eroare: Username-ul nu poate contine spatii.");
                    validUsername = false;
                } else if (!hasDigit) {
                    System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.");
                    validUsername = false;
                }
            }

            System.out.println();
        } while (!validUsername);

        System.out.println("Username acceptat: " + username);
        scanner.close();
    }
}