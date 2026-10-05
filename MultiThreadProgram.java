import java.util.Random;

class RandomNumber extends Thread {
    public void run() {
        Random r = new Random();
        int num = r.nextInt(100) + 1;

        System.out.println("Generated Number: " + num);

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
        System.out.println("Square of " + num + " = " + (num * num));
    }
}

class CubeThread extends Thread {
    int num;

    CubeThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Cube of " + num + " = " + (num * num * num));
    }
}

public class MultiThreadProgram {
    public static void main(String[] args) {
        RandomNumber t1 = new RandomNumber();
        t1.start();
    }
}