public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators + - * / %
        int a = 17, b = 2;
        int c = a + b;
        System.out.println(c);

        int k = a / b;
        double l = a / b; // both operands are of int type, after operation result is also of int type which finally gets assigned and type cast to double
        System.out.println(k);
        System.out.println(l);

        double m = (double) a / b; // or a / (double) b
        System.out.println(m);

        int rem = a % b;
        System.out.println(rem);

        // Assignment Operators = += -= *= /= %=
        int x = 10;
        x %= 5;
        System.out.println(x);

        // Relational Operators == != > >= < <=
        // returns true or false (boolean value)
        System.out.println(5 >= 3);
        System.out.println(x != 0);

        // Logical Operators && || !
        // circuit breaking can be used to optimize
        System.out.println((x == 0) && (rem == 0)); // if x == 0 is false then next condition will not be checked (circuit break) as both should be true to give result true, else it will always be false
        System.out.println(!(x==0));

        // Bitwise Operators & | ^ ~ >> << >>>
        // Study during bit manipulation

        // Increment/Decrement Operators ++ --
        x++; // x = x + 1
        System.out.println(x);
        x--; // x = x - 1
        System.out.println(x);

        // Ternary Operators ? : -> if else in one line



    }
}
