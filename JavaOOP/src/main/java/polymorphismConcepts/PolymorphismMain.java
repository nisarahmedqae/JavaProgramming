package polymorphismConcepts;

public class PolymorphismMain {

    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call the makeSound method on both objects
        dog.makeSound(); // Dog barks
        cat.makeSound(); // Cat meows

        // Using an array of Animal references
        Animal[] animals = {new Dog(), new Cat(), new Animal()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
        // Outputs:
        // Dog barks
        // Cat meows
        // Animal makes a sound
    }
}