package ClassAndObjects;
// Define the Car class
class Car {
    // Properties of the Car class
    String make;
    String model;
    int year;

    // Method to display the details of the car
    void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

// Main class
class main {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();

        // Set the properties of the Car object
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Call the method to display the details of the Car object
        myCar.displayDetails();
    }
}
