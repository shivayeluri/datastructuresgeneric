package datastructures.stack;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack<T> {
//    private int[] arr;
    ArrayList<T> arr;
    int SIZE ;
    private int top;
    private final int capacity;

    public Stack(int size) {
        SIZE = size;
        arr = new ArrayList<T>(SIZE);
        capacity = SIZE;
        top = -1;
    }

    public void operations() {
        System.out.println(" ");
        System.out.println("Choose one operation");
        System.out.print("1. stack\n2. Push\n3. Pop\n4. peek\n5. Is-empty\n6. size\n7.print\n8. stop");
        System.out.println(" ");
        int counter = 0;

        try{
            while(counter == 0)  {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("select operation");
                int option = sc.nextInt();
                if (option > 0 && option < 9) {
                    switch (option) {
                        case 1 -> stack();
                        case 2 -> {
                            System.out.println("What you want to insert : ");
                            String pushInput = sc.next();
                            push((T) pushInput);
                        }
                        case 3 -> {
                            pop();
                            printStack();
                        }
                        case 4 -> peek();
                        case 5 -> System.out.println(isEmpty());
                        case 6 -> size(SIZE);
                        case 7 -> printStack();
                        case 8 -> {
                            counter = 8;
                            System.out.println("GOOD BYE");
                            System.exit(-1);
                        }
                    }
                } else {
                    System.out.println("please enter 1-6 only");
                }
            }
        }catch (Exception e){
            System.out.println("Please chose between 1 - 6 only !");
            operations();
        }
    }

    public void stack(){
        System.out.println(arr);
    }

    public void push(T x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            operations();
        }

        arr.add(++top,x);
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        arr.remove(0);
        top--;

    }
    public void peek(){
        if(isEmpty()){
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        System.out.println("Top item :"+arr.get(top));
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public void size(int SIZE){
        System.out.println(SIZE);
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Your stack is empty");
        } else {
            for(int i = 0; i <= top; ++i) {
                T value = arr.get(i);
                System.out.print("" + value + ", ");
            }
        }

    }
}
