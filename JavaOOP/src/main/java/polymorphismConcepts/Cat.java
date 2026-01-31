package polymorphismConcepts;

//Derived class Cat
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}