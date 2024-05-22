package Methods;


class calculator{
    public int add(int a , int b){
        return a+b;
    }  

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method to add an array of integers
    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

 class method {
    public static void main(String[] args) {
        
        calculator obj = new calculator();
    
        int ans = obj.add(2,3);
        System.out.println(ans);


        int result1 = obj.add(2, 3); // Calls add(int, int)
        int result2 = obj.add(2, 3, 4); // Calls add(int, int, int)
        double result3 = obj.add(2.5, 3.5); // Calls add(double, double)
        int result4 = obj.add(new int[]{1, 2, 3, 4, 5}); // Calls add(int[])
        
        // Print the results
        System.out.println("Result of add(int, int): " + result1); // Outputs: 5
        System.out.println("Result of add(int, int, int): " + result2); // Outputs: 9
        System.out.println("Result of add(double, double): " + result3); // Outputs: 6.0
        System.out.println("Result of add(int[]): " + result4); // Outputs: 15
    }
}
