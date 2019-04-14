package java8LambdaBasics.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java8LambdaBasics.unit1.Person;

public class StandardFunctionalInterfaceExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carol", 42),
				new Person("Charlotte", "Carlyle", 51), 
				new Person("Thomas", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)
				);
		
		//Step 1: Sort list by last name
		
		Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		//Step 2: Create a method that prints all the elements in the list
		System.out.println("Printing all persons");
		performConditionally(people, p -> true, p -> System.out.println(p));
		
		//Step 3: Create a method that prints all the people that have last name starting with c
		System.out.println("\nPrinting all persons with last name starting with C");
		performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
		
		
		System.out.println("\nPrinting all persons with first name starting with C");
		performConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p));
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {

		for(Person p : people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
		
	}

}
