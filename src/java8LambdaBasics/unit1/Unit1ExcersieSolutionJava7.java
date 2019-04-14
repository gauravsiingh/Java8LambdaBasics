package java8LambdaBasics.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcersieSolutionJava7 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carol", 42),
				new Person("Charlotte", "Carlyle", 51), 
				new Person("Thomas", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)
				);
		
		//Step 1: Sort list by last name
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//Step 2: Create a method that prints all the elements in the list
		System.out.println("Printing all persons");
		printAll(people);
		
		//Step 3: Create a method that prints all the people that have last name starting with c
		System.out.println("\nPrinting all persons with last name starting with C");
		
		//printLastNameBeginningWithC(people);
		
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		
		
		System.out.println("\nPrinting all persons with first name starting with C");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
	}


	private static void printConditionally(List<Person> people, Condition condition) {

		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {

		for(Person p : people) {
			System.out.println(p);
		}
		
	}

}

interface Condition{
	public boolean test(Person p);
}
