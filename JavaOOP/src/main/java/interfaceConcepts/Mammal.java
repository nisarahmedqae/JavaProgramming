package interfaceConcepts;

public abstract class Mammal {
    protected int age;

    // Constructor
    public Mammal(int age) {
        this.age = age;
    }

    // Method
    public void grow() {
        age++;
        System.out.println("Growing... New age: " + age);
    }

}
