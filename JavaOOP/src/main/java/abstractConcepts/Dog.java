package abstractConcepts;

public class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age); // Call to superclass constructor
        this.breed = breed;
    }

    // Implementation of abstract methods
    @Override
    public void eat() {
        System.out.println(name + " the dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println(name + " the dog is sleeping");
    }

    // Additional method specific to Dog
    public void bark() {
        System.out.println(name + " is barking");
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}
