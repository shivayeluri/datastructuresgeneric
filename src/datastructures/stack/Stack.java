package datastructures.stack;

import java.util.ArrayList;

public class Stack<T> {
    ArrayList<T> arr;
    int SIZE ;
    int top;
    int capacity;

    public Stack(int size) {
        SIZE = size;
        arr = new ArrayList<T>(size);
        capacity = size;
        top = -1;
    }

    public void stack(){
        System.out.println(arr);
    }

    public void push(T x) {
//        if (isFull()) {
//            System.out.println("Stack OverFlow");
//        }

        arr.add(++top,x);
//        capacity -= 1;
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
        }
        System.out.println("Top item :"+arr.get(top));
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public int size(int SIZE){
        return SIZE;
    }

    public Boolean isFull() {
        return top == capacity-1 ;
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
