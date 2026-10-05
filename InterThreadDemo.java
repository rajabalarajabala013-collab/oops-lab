class SharedData {
    int number;
    boolean available = false;

    // Producer produces a number
    synchronized void produce(int num) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        number = num;
        available = true;

        System.out.println("Producer produced: " + number);

        notifyAll();
    }

    // Consumer consumes the number
    synchronized void consume() {
        while (!available) {
            try {
                System.out.println("Consumer is waiting...");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Consumer consumed: " + number);

        available = false;

        notifyAll();
    }
}

// Producer Thread
class Producer extends Thread {
    SharedData data;

    Producer(SharedData data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.produce(i);
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    SharedData data;

    Consumer(SharedData data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.consume();
        }
    }
}

// Main Class
public class InterThreadDemo {
    public static void main(String[] args) {

        SharedData data = new SharedData();

        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        producer.start();
        consumer.start();
    }
}