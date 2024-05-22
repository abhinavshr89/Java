
public class Main {
    public static void main(String[] args) {
        // Primitive data types
        int num1 = 9;
        byte by = 127;
        short sh = 32000;
        long l = 123456789L;
        float f = 5.75f;
        double d = 19.99;
        char letter = 'A';    
        boolean flag = true;
        
        // Reference data types
        String str = "Hello, World!";
        int[] arr = {1, 2, 3, 4, 5};
        
        // Printing the values
        System.out.println("int: " + num1);
        System.out.println("byte: " + by);
        System.out.println("short: " + sh);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + flag);
        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }
}
