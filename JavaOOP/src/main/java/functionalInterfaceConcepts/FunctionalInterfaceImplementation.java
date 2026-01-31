package functionalInterfaceConcepts;

public class FunctionalInterfaceImplementation implements MyFunctionalInterface {

	public static void main(String[] args) {
		FunctionalInterfaceImplementation main = new FunctionalInterfaceImplementation();
		main.myMethod("hello");

	}

	@Override
	public void myMethod(String s) {
		System.out.println("myMethod of MyFunctionalInterface is implemented");
		System.out.println(s);
	}

}
