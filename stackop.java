// Problem 1:
// Create an interface Stack with size and methods push(), pop(),
// display(), overflow(), underflow().
// Implement IntegerStack and test all methods.

interface Stack {
    int size = 5;

    void push(int x);
    void pop();
    void display();
    void overflow();
    void underflow();
}

class IntegerStack implements Stack {
    int arr[] = new int[size];
    int top = -1;

    public void push(int x) {
        if(top == size - 1)
            overflow();
        else
            arr[++top] = x;
    }

    public void pop() {
        if(top == -1)
            underflow();
        else
            System.out.println("Popped: " + arr[top--]);
    }

    public void display() {
        if(top == -1)
            System.out.println("Stack is empty");
        else {
            for(int i = top; i >= 0; i--)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public void overflow() {
        System.out.println("Stack Overflow");
    }

    public void underflow() {
        System.out.println("Stack Underflow");
    }
}

public class StackTest {
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}