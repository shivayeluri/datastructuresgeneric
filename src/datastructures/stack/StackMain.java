package datastructures.stack;

import menu.Menu;

public class StackMain {
    public static void main(String[] args) {
        new Menu<>(Integer.parseInt(args[0])).stackOperations();
    }
}
