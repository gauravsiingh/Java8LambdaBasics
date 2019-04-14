package java8LambdaBasics.unit2;

public class ClousuresExample {

	public static void main(String[] args) {
		int a = 10, b = 20;
		doProcess(a, i -> System.out.println(i + b));

	}

	private static void doProcess(int a, Process p) {
		p.process(a);
	}

}

interface Process{
	void process(int i);
}

