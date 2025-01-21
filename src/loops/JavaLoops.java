package loops;

import java.util.Scanner;

public class JavaLoops {
    public static void main(String[] args) {
        // Initialization expression
        // Test Expression (Condition at which loop stops, returns boolean)
        // Update Expression
        // Loop Body

        // for loop
        // sum of first 5 even numbers
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += 2 * i;
            System.out.print(2 * i + " + ");
        }
        System.out.println(" = " + sum);


        // while loop
        // used mostly where we don't know how many times we have to run the loop, we just know the condition
        // like traversing linked list, binary tree etc.
        Scanner sc = new Scanner(System.in);
        boolean hasLearnt = false;
        while (!hasLearnt) {
            System.out.println("Going to school to learn");
            System.out.print("Have you understood? : ");
            hasLearnt = sc.nextBoolean();
        }
        sc.close();

        int i = 0;
        while (i < 5) {
            System.out.print(i + " ");
            i++; // if no increment then loop will be infinite
        }
        System.out.println();


        // do while loop
        // executes body at least once and then behaves as while loop 
        do {
            // value of i is 5 here
            System.out.println(i);
            i++;
        } while (i < 2);


        // break and continue statements in java

        // break is used to get out of the loop
        for (int j = 0; j <= 20; j += 2) {
            System.out.println(j);
            if (j >= 10)    break;
        }

        i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
            if (i == 3) break;
        }

        // continue statement is used to skip current iteration
        for (int j = 0; j <= 20; j += 2) {
            if (j == 10 || j == 14)    continue;
            System.out.println(j);
        }


        // nested loops (loop inside the body of another loop)
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k <= 10; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }


        // labeled break and continue statement
        // rarely used as most of the time we refactor our code to simplify, but sometimes useful in nested loops
        // not a recommended practice though
        outerLoop:
        for (int j = 0; j < 10; j++) {
            int k = 0;
            while (k <= 5) {
                if(k == 3)  break outerLoop; // it breaks out from outerLoop
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
