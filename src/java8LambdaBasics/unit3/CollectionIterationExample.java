package java8LambdaBasics.unit3;

import java.util.Arrays;
import java.util.List;

import java8LambdaBasics.unit1.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carol", 42),
				new Person("Charlotte", "Carlyle", 51), 
				new Person("Thomas", "Bronte", 45),
				new Person("Mathew", "Arnold", 39));
		
		//Old ways
		System.out.println("Printing list using for loop");
		for(int i = 0 ; i < people.size() ; i++) {
			System.out.println(people.get(i));
		}
		System.out.println("\nPrinting list using for in loop");
		for(Person p : people) {
			System.out.println(p);
		}
		
		System.out.println("\nPrinting list using forEach loop from Java8");
		//people.forEach(p -> System.out.println(p));
		
		people.forEach(System.out::println);

	}

}
