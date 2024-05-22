# Classes and objects

### Class : A blueprint for creating objects, defining their properties and behaviors.
```java
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
```
### Object :An instance of a class, representing a specific implementation with actual values for its properties. 
```java
// Create an object of the Car class
        Car myCar = new Car();

        // Set the properties of the Car object
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

```