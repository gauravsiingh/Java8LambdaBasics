package java8LambdaBasics.unit3;

import java.util.Arrays;
import java.util.List;

import java8LambdaBasics.unit1.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carol", 42),
				new Person("Charlotte", "Carlyle", 51), 
				new Person("Thomas", "Bronte", 45),
				new Person("Mathew", "Arnold", 39));
		
		people.stream().
		filter(p -> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getLastName()));
	}

}
