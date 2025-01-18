package basics2;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // User input using Scanner
        // We use predefined class Scanner provided by Java

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float y = sc.nextFloat();

        sc.close(); // to allow GC to remove this object from memory and avoid memory leakage

        System.out.println(x);
        System.out.println(y);
        System.out.println(x + y);

    }
}
