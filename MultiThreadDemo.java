import java.util.Random;


class RandomNumber extends Thread {
    public void run() {
        Random r = new Random();
        int num = r.nextInt(100);

        System.out.println("Generated Random Number: " + num);

        if (num % 2 == 0) {
            SquareThread square = new SquareThread(num);
            square.start();
        } else {
            CubeThread cube = new CubeThread(num);
            cube.start();
        }
    }
}


class SquareThread extends Thread {
    int num;

    SquareThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Number is Even");
        System.out.println("Square of " + num + " = " + (num * num));
    }
}


class CubeThread extends Thread {
    int num;

    CubeThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Number is Odd");
        System.out.println("Cube of " + num + " = " + (num * num * num));
    }
}


public class MultiThreadDemo {
    public static void main(String[] args) {
        RandomNumber random = new RandomNumber();
        random.start();
    }
}