package java8LambdaBasics.unit1;

public class RunnableExample {

	public static void main(String[] args) {

		Thread innerClassThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable inner says hi.");

			}
		});

		innerClassThread.start();

		Thread lambdaThread = new Thread(() -> System.out.println("Lambda says hi"));

		lambdaThread.start();

	}

}
