package java8LambdaBasics.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java8LambdaBasics.unit1.Person;

public class MethodRefernceExample2 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carol", 42),
				new Person("Charlotte", "Carlyle", 51), 
				new Person("Thomas", "Bronte", 45),
				new Person("Mathew", "Arnold", 39));
				
		System.out.println("Printing all persons");
		//performConditionally(people, p -> true, p -> System.out.println(p));
		
		performConditionally(people, p -> true, System.out::println);
		
}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {

		for(Person p : people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
		
	}

}
