package speedconverter;

import java.util.Scanner;

public class SpeedConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("SPEED CONVERTER");
        System.out.println("1. Meter/Second to Kilometer/Hour");
        System.out.println("2. Kilometer/Hour to Meter/Second");
        System.out.println("3. Meter/Second to Miles/Hour");
        System.out.println("4. Miles/Hour to Meter/Second");
        System.out.println("5. Kilometer/Hour to Miles/Hour");
        System.out.println("6. Miles/Hour to Kilometer/Hour");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter speed: ");
        double speed = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (speed * 3.6) + " km/h");
                break;

            case 2:
                System.out.println("Result = " + (speed / 3.6) + " m/s");
                break;

            case 3:
                System.out.println("Result = " + (speed * 2.23694) + " mph");
                break;

            case 4:
                System.out.println("Result = " + (speed / 2.23694) + " m/s");
                break;

            case 5:
                System.out.println("Result = " + (speed * 0.621371) + " mph");
                break;

            case 6:
                System.out.println("Result = " + (speed * 1.60934) + " km/h");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}