package functionalInterfaces;

public class MainClass {
	public static void main(String[] args) {
		FunctionalInterface functionalInterface = new FunctionalInterface() {
			@Override
			public int interfaceMethod(int age) {
				return 0;
			}
		};

		// lambda expression
		FunctionalInterface functionalInterface1 = (int age) -> {
			System.out.println("Your age is " + age);
			return 0;
		};
		functionalInterface1.interfaceMethod(56);

		FunctionalInterface functionalInterface2 = (int age) -> 2 * age;
		System.out.println(functionalInterface2.interfaceMethod(56));


	}
}
