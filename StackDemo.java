interface Stack {
    void push(int item);
    void display();
}

class StackImpl implements Stack {
    int stack[] = new int[5];
    int top = -1;

    public void push(int item) {
        try {
            if (top == stack.length - 1) {
                throw new Exception("Stack Overflow");
            }

            stack[++top] = item;
            System.out.println(item + " pushed into stack");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void display() {
        try {
            if (top == -1) {
                throw new Exception("Stack Underflow - Stack is empty");
            }

            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        StackImpl s = new StackImpl();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.display();

        // Trying to push when stack is full
        s.push(60);
    }
}