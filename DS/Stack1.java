import java.util.Scanner;

public class Stack1 {
    private int top;
    private int maxSize;
    private int[] stackArray;

    Stack1(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // push method
    public void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Stack is overflow");
            return;
        } else {
            stackArray[++top] = data;
            System.out.println("insserted data "+""+ data);
        }
    }

    // pop method
    public void pop() {
        if (top == -1) {
            System.out.println("stack is underflow");
            return;
        } else {
            System.out.println("deleted the data" + stackArray[top--]);
            return;
        }
    }

    // peek method
    public void peek() {
        if (top == -1) {
            System.out.println("stack is empty");
            return;
        } else {
            System.out.println("top element is " + stackArray[top]);
        }
    }

    // Display operation
    public void display() {
        if (top == -1) {
            System.out.println("stack is empty");
            return;
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i] + "");
            }
        }
    }

    public void sort() {
        for (int ii = 0; ii >= 0; ii--) {
            bubbleSort(stackArray);
            for (int i : stackArray) {
                System.out.println("sorted data"+"" + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the stack data");

        int size = sc.nextInt();
        Stack1 stack = new Stack1(size);
        int choice = 0;
        do {
            System.out.println("\n ------------------------Stack menu driver ------------------");
            System.out.println("1 push");
            ;
            System.out.println("2 pop");
            System.out.println("3 peek");
            System.out.println("4 display");
            System.out.println("5 sort");
            System.out.println("6 to exit ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the data to push");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    stack.sort();
                    break;
                case 6:
                    System.out.println("exit from stack");
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        } while (choice != 6);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
