package java8LambdaBasics.unit1;

public class Greeter {

	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		HelloWorldGreeter helloWorldGreeter = new HelloWorldGreeter();

		greeter.greet(helloWorldGreeter);

		Greeting lambdaGreeting = () -> System.out.println("Greeting from lambda.");

		greeter.greet(lambdaGreeting);
		
		Greeting innerClassGreeting = new Greeting() {

			public void perform() {
				System.out.println("Greeting from ananoymus inner class");
			}

		};
		
		greeter.greet(innerClassGreeting);

	}

	private void greet(Greeting greeting) {
		greeting.perform();
	}

}
