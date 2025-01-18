package conditionalStatements;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        // if else
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }

        // if else-if else
        if (age > 18) {
            System.out.println("You can vote");
        } else if (age == 18) {
            System.out.println("Welcome to your first vote!!");
        } else {
            System.out.println("You can't vote");
        }

        // nested if else
        int a, b, c;
        System.out.println("Enter a, b and c : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b) {
            if (a == c) {
                System.out.println("a and c are largest");
            } else if (a > c) {
                System.out.println("a is largest");
            } else {
                System.out.println("c is largest");
            }
        } else {
            if (b == c) {
                System.out.println("b and c are largest");
            } else if (b > c) {
                System.out.println("b is largest");
            } else {
                System.out.println("c is largest");
            }
        }

        // Ternary Operator ? : -> replacement of if else
        System.out.println("Enter p, q : ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int max = p > q ? p : q;
        System.out.println("Bigger num is : " + max);

        int maxABC = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Max of a, b, c : " + maxABC);

        sc.close();

    }
}
