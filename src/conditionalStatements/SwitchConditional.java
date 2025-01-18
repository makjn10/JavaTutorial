package conditionalStatements;

import java.util.Scanner;

public class SwitchConditional {
    public static void main(String[] args) {
        // Switch is considered to be faster than if else in some cases

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day : ");
        int day = sc.nextInt();

/*        if (day == 1) {
            System.out.println("Today is Sunday");
        } else if (day == 2) {
            System.out.println("Today is Monday");
        }
        |
        |
        |*/

        // switch can have primitive datatypes, String, Enum
        switch (day) {
            case 1:
                System.out.println("Today is Sunday");
                System.out.println("Enjoy!!!!");
                break; // break is required as switch will execute all the remaining below statements
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default: // if no condition matches then this executes
                System.out.println("Invalid day!! Enter number from 1 - 7");
        }


        sc.close();
    }
}
