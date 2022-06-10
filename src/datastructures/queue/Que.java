package datastructures.queue;

import java.util.ArrayList;
import java.util.Scanner;

public class Que<T> {
    int SIZE;
    ArrayList<T> items;
    int front;
    int rear;

    public Que(int size) {
        SIZE = size;
//        items = new T[];
        items = new ArrayList<T>(SIZE);
        front = -1;
        rear = -1;
    }

    public void queue(){
        System.out.println(items);
    }
    boolean isQueFull() {
        return front == 0 && rear == SIZE - 1;
    }

    boolean isQueEmpty() {
        return front == -1;
    }

    public void size(int SIZE){
        System.out.println("predefined size : "+SIZE);
    }

    void enQueue(T element) {
        if (isQueFull()) {
            System.out.println("Queue is full");
            System.exit(-1);
        } else {
            if (front == -1) {
                front = 0;
            }

            ++rear;
            items.add(rear, element);
            System.out.println("Insert " + element);
        }

    }

    void deQueue() {
        if (isQueEmpty()) {
            System.out.println("Queue is empty");
        } else {
            T element = items.get(rear);
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                --rear;
            }

            System.out.println("" + element + " Deleted");
        }

    }

    void display() {
        if (isQueEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");

            for (int i = rear; i >= front; --i) {
                T value = items.get(i);
                System.out.print("" + value + "  ");
            }

            System.out.println("\nRear index-> " + rear);
        }

    }
}
