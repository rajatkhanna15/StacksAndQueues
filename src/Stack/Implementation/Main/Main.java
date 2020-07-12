package Stack.Implementation.Main;

import Stack.Implementation.Stackshow.StackShow;

import java.util.*;

/**
 * Main class which acts as a tester class for StackShow class.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackShow st = new StackShow(100);
        System.out.println("How many elements you want to enter in the stack? ");
        int n =scanner.nextInt();
        System.out.println("Enter the elements :");
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            st.push(x);
        }

    }
}
