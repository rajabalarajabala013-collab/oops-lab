package converter;

public class Volume {

   
    public static double literToUSGallon(double liter) {
        return liter * 0.264172;
    }

    public static double literToImperialGallon(double liter) {
        return liter * 0.219969;
    }

    // Gallons to Liter
    public static double usGallonToLiter(double gallon) {
        return gallon * 3.78541;
    }

    public static double imperialGallonToLiter(double gallon) {
        return gallon * 4.54609;
    }


    public static double literToCubicMeter(double liter) {
        return liter * 0.001;
    }


    public static double cubicMeterToLiter(double cubicMeter) {
        return cubicMeter * 1000;
    }
}

package app;

import java.util.Scanner;
import converter.Volume;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== VOLUME CONVERTER =====");
        System.out.println("1. Liter to US Gallon");
        System.out.println("2. Liter to Imperial Gallon");
        System.out.println("3. US Gallon to Liter");
        System.out.println("4. Imperial Gallon to Liter");
        System.out.println("5. Liter to Cubic Meter");
        System.out.println("6. Cubic Meter to Liter");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter the volume: ");
        double value = sc.nextDouble();

        double result = 0;

        switch (choice) {

            case 1:
                result = Volume.literToUSGallon(value);
                System.out.printf("%.2f Liters = %.2f US Gallons%n",
                        value, result);
                break;

            case 2:
                result = Volume.literToImperialGallon(value);
                System.out.printf("%.2f Liters = %.2f Imperial Gallons%n",
                        value, result);
                break;

            case 3:
                result = Volume.usGallonToLiter(value);
                System.out.printf("%.2f US Gallons = %.2f Liters%n",
                        value, result);
                break;

            case 4:
                result = Volume.imperialGallonToLiter(value);
                System.out.printf("%.2f Imperial Gallons = %.2f Liters%n",
                        value, result);
                break;

            case 5:
                result = Volume.literToCubicMeter(value);
                System.out.printf("%.2f Liters = %.4f Cubic Meters%n",
                        value, result);
                break;

            case 6:
                result = Volume.cubicMeterToLiter(value);
                System.out.printf("%.2f Cubic Meters = %.2f Liters%n",
                        value, result);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}