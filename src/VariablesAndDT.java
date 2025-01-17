public class VariablesAndDT {
    public static void main(String[] args) {
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
        char c = 'v'; // 2 bytes, store ASCII character in single quotes, default - '\u0000'

        // Datatypes Implicit Conversion
        // Small bucket things can easily be stored in bigger bucket (Widening)
        // But Big bucket things will have lossy conversion when storing in smaller bucket (Explicit conversion)

        int count = 56;
        long countLong = count; // implicit conversion

        long cL = 987987898787687678L;
        int countInt = (int) cL; // explicit conversion, lossy conversion, prints 1704979710
        int countInt2 = (int) countLong; // explicit conversion or type casting

        System.out.println(countInt);
        System.out.println(countInt2);
    }
}
