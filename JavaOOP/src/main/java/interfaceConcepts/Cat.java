package interfaceConcepts;

public class Cat extends Mammal implements Animal {
    private String color;

    // Constructor
    public Cat(int age, String color) {
        super(age); // Call to superclass constructor
        this.color = color;
    }

    // Implementation of eat method
    public void eat() {
        System.out.println("Cat is eating");
    }

    // Implementation of sleep method
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    // Method to display cat info
    public void displayInfo() {
        System.out.println("Cat color: " + color + ", Age: " + age);
    }
}
