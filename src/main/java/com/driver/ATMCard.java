package com.driver;

import java.util.Scanner;

public class ATMCard {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter card number: ");
        String cardNumber = sc.nextLine();

        System.out.print("Enter pin: ");
        String pin = sc.nextLine();

        try {
            validateCardNumber(cardNumber);
            validatePin(pin);
            System.out.println("Authentication Successful");
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
    }

    public static void validateCardNumber(String cardNumber) throws InvalidCardNumberException, NumberFormatException {
        if (cardNumber.length() != 12) {
            throw new InvalidCardNumberException("Card number should be 12 digits long.");
        }
        if (!cardNumber.matches("\\d+")) {
            throw new NumberFormatException("Card number should only contain numbers.");
        }
    }

    public static void validatePin(String pin) throws InvalidPinException, NumberFormatException {
        if (pin.length() != 4) {
            throw new InvalidPinException("Pin should be 4 digits long.");
        }
        if (!pin.matches("\\d+")) {
            throw new NumberFormatException("Pin should only contain numbers.");
        }
    }
}
