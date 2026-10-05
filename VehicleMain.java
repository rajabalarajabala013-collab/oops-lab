import java.util.Scanner;

class Vehicle {
    String vehicleNumber, model, manufacturer;
    double price;

    Vehicle(String vehicleNumber, String model, String manufacturer, double price) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("\nVehicle Number : " + vehicleNumber);
        System.out.println("Model          : " + model);
        System.out.println("Manufacturer   : " + manufacturer);
        System.out.println("Price          : " + price);
    }
}

class Car extends Vehicle {
    Car(String n, String m, String man, double p) {
        super(n, m, man, p);
    }

    void calculate() {
        double tax = price * 0.10;
        double insurance = price * 0.05;
        displayDetails();
        System.out.println("Vehicle Type   : Car");
        System.out.println("Road Tax       : " + tax);
        System.out.println("Insurance      : " + insurance);
        System.out.println("Total Cost     : " + (price + tax + insurance));
    }
}

class Bike extends Vehicle {
    Bike(String n, String m, String man, double p) {
        super(n, m, man, p);
    }

    void calculate() {
        double tax = price * 0.05;
        double insurance = price * 0.03;
        displayDetails();
        System.out.println("Vehicle Type   : Bike");
        System.out.println("Road Tax       : " + tax);
        System.out.println("Insurance      : " + insurance);
        System.out.println("Total Cost     : " + (price + tax + insurance));
    }
}

class Truck extends Vehicle {
    Truck(String n, String m, String man, double p) {
        super(n, m, man, p);
    }

    void calculate() {
        double tax = price * 0.15;
        double insurance = price * 0.08;
        displayDetails();
        System.out.println("Vehicle Type   : Truck");
        System.out.println("Road Tax       : " + tax);
        System.out.println("Insurance      : " + insurance);
        System.out.println("Total Cost     : " + (price + tax + insurance));
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Number: ");
        String no = sc.nextLine();

        System.out.print("Enter Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Manufacturer: ");
        String manufacturer = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.println("\n1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");
        System.out.print("Enter Vehicle Type: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                new Car(no, model, manufacturer, price).calculate();
                break;
            case 2:
                new Bike(no, model, manufacturer, price).calculate();
                break;
            case 3:
                new Truck(no, model, manufacturer, price).calculate();
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}