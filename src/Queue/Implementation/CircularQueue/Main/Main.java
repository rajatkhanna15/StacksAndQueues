package Queue.Implementation.CircularQueue.Main;

import Queue.Implementation.CircularQueue.QueueArray.QueueArray;
import java.util.*;
/**
 * Main class which acts as as tester class for QueueArray class.
 */
public class Main {

    public static void main(String[] args) {
        QueueArray qArray = new QueueArray(25);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items you want to enter??");
        int n = scanner.nextInt();
        System.out.println("Enter the data items:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            qArray.insert(value);
        }
        System.out.println("Element at front");
        System.out.println(qArray.peekFront());
        System.out.println("Two deleted elements:");
        while( !qArray.isEmpty())
        {
            System.out.println(qArray.remove());
            System.out.println(qArray.remove());
            break;
        }
    }

}

