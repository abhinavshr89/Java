
public class typecasting {
    public static void main(String[] args) {
        int num = 10;
        double doubleNum = num; // Automatic type casting: int to double
        System.out.println(doubleNum); // Outputs: 10.0

        double doubleNum_ = 10.5;
        int num_ = (int) doubleNum_; // Explicit type casting: double to int
        System.out.println(num_); // Outputs: 10

    }
}
