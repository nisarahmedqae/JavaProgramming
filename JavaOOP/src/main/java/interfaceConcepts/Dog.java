package interfaceConcepts;

public class Dog extends Mammal implements Animal {
    private String breed;

    // Constructor
    public Dog(int age, String breed) {
        super(age); // Call to superclass constructor
        this.breed = breed;
    }

    // Implementation of eat method
    public void eat() {
        System.out.println("Dog is eating");
    }

    // Implementation of sleep method
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    // Method to display dog info
    public void displayInfo() {
        System.out.println("Dog breed: " + breed + ", Age: " + age);
    }
}

