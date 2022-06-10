package menu;

import datastructures.queue.Que;
import datastructures.stack.Stack;

import java.util.Scanner;

public class Menu<T> {
//    public void linkedListOperations(){
//        System.out.println("\n Choose one operation: ");
//        System.out.println("1. list\n2. add\n3. remove\n4. search\n5. isEmpty\n6. size\n7. append\n8. index\n9. insert\n10.pop\n11. exit");
//        int counter = 0;
//
//        Scanner sc = new Scanner(System.in);
//        LinkedList<T> list = new LinkedList<>();
//        try{
//            while(counter != 11) {
//                System.out.println();
//                System.out.println("Select any operation : ");
//                int option = sc.nextInt();
//                if (option > 0 && option < 12) {
//                    switch (option) {
//                        case (1) -> System.out.println("list");
//                        case (2) -> {
//                            System.out.println("please enter what you want : ");
//                            String data = sc.next();
//                            list.add((T) data);
////                            list.print();
//                        }
//                        case (3) -> {
//                            System.out.println("please enter where you want to delete : ");
//                            T data = (T) sc.next();
//                            list.remove(data);
//                        }
//                        case (4) -> list.print();
//                        case (5) -> System.out.println("isEmpty");
//                        case (6) -> System.out.println("size");
//                        case (7) -> System.out.println("append");
//                        case (8) -> System.out.println("index");
//                        case (9) -> System.out.println("insert");
//                        case (10) -> System.out.println("pop");
//                        case (11) -> {
//                            System.out.println("Good Bye!!");
//                            counter = option;
//                        }
//                    }
//                } else {
//                    System.out.println("please choose option between 1-11 only!");
//                }
//            }
//        }catch (Exception e){
//            System.out.println("please choose between 1-11 only.");
//            linkedListOperations();
//        }
//    }
    int SIZE;
    Que<Object> q = new Que<>(SIZE);
    Stack<Object> stack = new Stack<>(SIZE);
    public Menu(int size) {
        SIZE = size;
    }

    public void queueOperation() {
        System.out.println(" ");
        System.out.println("Choose one operation");
        System.out.print("1. queue\n2. enqueue\n3. dequeue\n4. is-empty\n5. size\n6.exit");
        System.out.println(" ");
        int counter = 0;
        int length = 0;

        try {
            while (counter != 6) {
                Scanner sc = new Scanner(System.in);
                System.out.println("select operation");
                int option = sc.nextInt();
                if (option > 0 && option < 7) {
                    switch (option) {
                        case 1 -> q.queue();
                        case 2 -> {
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("what you want to enqueue");
                            String input = sc1.next();
                            q.enQueue(input);
                            length+=1;
                        }
                        case 3 -> q.deQueue();
                        case 4 -> System.out.println(q.isQueEmpty());
                        case 5 -> {
                            System.out.println("pre-defined size = "+ q.size(SIZE));
                            System.out.println("actual size = "+(q.size(SIZE) - length));
                        }
                        case 6 -> {
                            q.display();
                            counter = 6;
                            System.exit(-1);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("If your selecting queue operations, Please chose between 1 - 4 only !");
            queueOperation();
        }
    }

    public void stackOperations() {
        System.out.println(" ");
        System.out.println("Choose one operation");
        System.out.print("1. stack\n2. Push\n3. Pop\n4. peek\n5. Is-empty\n6. size\n7. stop");
        System.out.println(" ");
        int counter = 0;
        int length = 0;

        try{
            while(counter == 0)  {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("select operation");
                int option = sc.nextInt();
                if (option > 0 && option < 7) {
                    switch (option) {
                        case 1 -> stack.stack();
                        case 2 -> {
                            System.out.println("What you want to insert : ");
                            String pushInput = sc.next();
                            stack.push((T) pushInput);
                            length++;
                        }
                        case 3 -> {
                            stack.pop();
                        }
                        case 4 -> stack.peek();
                        case 5 -> System.out.println(stack.isEmpty());
                        case 6 -> {
                            int initialLength = stack.size(SIZE);
                            System.out.println("Pre-defined size = "+initialLength);
                            System.out.println("Actual size = "+length);
                        }
                        case 7 -> {
                            counter = 7;
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
            stackOperations();
        }
    }
}
