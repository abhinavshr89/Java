# Method Overriding 
**Method Overriding in Java is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. The overridden method in the subclass should have the same name, return type, and parameter list as the method in the superclass.**

### Key Points:
* `Inheritance`: Method overriding can only occur in the context of inheritance, i.e., when a class inherits from another class.
* `Same Method Signature`: The method in the subclass must have the same name, return type, and parameter list as the method in the superclass.
* `@Override Annotation`: Although optional, using the @Override annotation is good practice. It helps to catch errors at compile-time, ensuring that the method signature is correctly overridden.
* `Access Modifier`: The access level of the overriding method cannot be more restrictive than the overridden method. For example, if the superclass method is public, the subclass method cannot be protected or private.


```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
```
```java
Animal myAnimal = new Animal();
myAnimal.sound(); // Outputs: Animal makes a sound

Dog myDog = new Dog();
myDog.sound(); // Outputs: Dog barks
```