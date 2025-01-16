// Java is an OO language and everything works in form of class and objects
// file name should match with class name
public class HelloWorld { // this is a block

    public static void main(String[] args) { // main function - Java program starts from here
        System.out.println("Hello World!");
        System.out.println(3 + 4);
        System.out.println("3 + 4");

        // variables
        int age = 26;
        System.out.println(age);
        age = 56;
        System.out.println(age);

        int marksOfStudent = 99; // camelcase
        System.out.println(marksOfStudent);

        // primitive datatypes
        // primitive DTs are used to build non-primitive DTs
        int x = 56; // 4 bytes, default - 0
        long y = 56L; // 8 bytes, default - 0
        short x1 = 5; // 2 bytes, default - 0
        byte x2 = 4; // 1 byte, default - 0
        float z = 5.6F; // 4 bytes, default - 0.0f
        double a = 5.6; // 8 bytes, default - 0.0d
        boolean b = true; // 1 bit , default - false
        char c = 'v'; // store ASCII character in single quotes, default - '\u0000'

        

    }

}
