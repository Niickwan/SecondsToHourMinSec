package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Exercise 3.3
        int hour;
        int minutes;
        double seconds;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seconds to be converted to Hours, Minutes and Seconds: ");
        int secondsToConvert = scanner.nextInt();

        hour = secondsToConvert / 60 / 60;
        minutes = ((secondsToConvert - (hour * 3600)) / 60);
        seconds = secondsToConvert % 60;
        System.out.printf("%d Hours, %d Minutes, %.0f Seconds", hour, minutes, seconds);
    }
}
