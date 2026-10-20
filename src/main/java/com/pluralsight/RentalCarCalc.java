package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalc {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter pickup date: ");
        String pickupDate = myScanner.nextLine();

        System.out.print("Enter number of days: ");
        int days = myScanner.nextInt();

        System.out.print("Toll tag? (yes/no): ");
        String tollTag = myScanner.next();

        System.out.print("GPS? (yes/no): ");
        String gps = myScanner.next();

        System.out.print("Roadside assistance? (yes/no): ");
        String roadside = myScanner.next();

        System.out.print("Enter your age: ");
        int age = myScanner.nextInt();

        double basicRental = days * 29.99;
        double optionsCost = 0;

        switch (tollTag) {
            case "yes" -> optionsCost += 3.95 * days;
            case "no" -> optionsCost += 0;
        }

        switch (gps) {
            case "yes" -> optionsCost += 2.95 * days;
            case "no" -> optionsCost += 0;
        }

        switch (roadside) {
            case "yes" -> optionsCost += 3.95 * days;
            case "no" -> optionsCost += 0;
        }

        double surcharge = 0;
        if (age < 25) {
            surcharge = basicRental * 0.30;
        }

        double totalCost = basicRental + optionsCost + surcharge;

        System.out.println("Pickup date: " + pickupDate);
        System.out.printf("Basic car rental: $%.2f%n", basicRental);
        System.out.printf("Options cost: $%.2f%n", optionsCost);
        System.out.printf("Underage surcharge: $%.2f%n", surcharge);
        System.out.printf("Total cost: $%.2f%n", totalCost);
    }
}
