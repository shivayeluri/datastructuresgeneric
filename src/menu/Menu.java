package menu;

import datastructures.queue.Que;

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
        System.out.print("1. Stack\n2. Push\n3. Pop\n4. peek\n5. Is-empty\n6. size\n7. exit");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        boolean counter = true;

        try{
            while(counter)  {
                Scanner sc2 = new Scanner(System.in);
                System.out.println();
                System.out.println("select operation");
                int option = sc2.nextInt();
                if (option > 0 && option < 8) {
                    switch (option) {
                        case 1 -> System.out.println("Stack");
                        case 2 -> System.out.println("Push");
                        case 3 -> System.out.println("pop");
                        case 4 -> System.out.println("peek");
                        case 5 -> System.out.println("Is-empty");
                        case 6 -> System.out.println("size");
                        case 7 ->{
                            System.out.println("Good Bye!!");
                            counter = false;
                        }

                    }
                } else {
                    System.out.println("Please chose option between 1 - 7 only !");
                }
            }
        }catch (Exception e){
            stackOperations();
        }
    }
}
