package datastructures.queue;

import menu.Menu;

public class QueueMain {
    public static void main(String[] args) {
        new Menu<>(Integer.parseInt(args[0])).queueOperation();
    }
}
