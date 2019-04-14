package java8LambdaBasics.unit3;

public class MethodRefernceExample1 {

	public static void main(String[] args) {
	
		//Thread t = new Thread(() -> printMessage());
		
		Thread t = new Thread(MethodRefernceExample1::printMessage);
		
		t.start();

	}
	
	public static void printMessage() {
		System.out.println("Hello World!");
	}

}
