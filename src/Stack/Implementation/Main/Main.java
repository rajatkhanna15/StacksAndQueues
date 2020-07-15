package Stack.Implementation.Main;

import Stack.Implementation.Stackshow.StackShow;
import java.util.Scanner;
/**
 * Main class which acts as a tester class for StackShow class.
 */
public class Main {

    public static void main(String[] args) {
        StackShow stack = new StackShow(100);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many elements you want to enter?");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            stack.push(arr[i]);
        }
        while(!stack.isEmpty())
        {
            int value = stack.pop();
            System.out.println(value + " ");
        }


    }
}

