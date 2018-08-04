package PerformSeveralOperations;


import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class TestOperations {
	
	// Checking if the number is odd using Predicate.
		public static Predicate<Integer> isOdd() {
			Predicate<Integer> predicate = (number) -> {
				return (number % 2 != 0) ? true : false;
			};
			return predicate;
		}

		// Checking if the number is even using Predicate.
		public static Predicate<Integer> isEven() {
			Predicate<Integer> predicate = (number) -> {
				return (number % 2 == 0) ? true : false;
			};
			return predicate;
		}
		
		public static Predicate<Integer> isDivisibleBy6() {
			Predicate<Integer> predicate = (number) -> {
				return (number % 6 == 0) ? true : false;
			};
			return predicate;
		}
		
		public static Predicate<Integer> isLessThan12(){
			Predicate<Integer> predicate = (number) -> {
				return (number < 12) ? true : false;
			};
			return predicate;
		}
		
		public static Predicate<Integer> isGreaterThan50(){
			Predicate<Integer> predicate = (number) -> {
				return (number > 50) ? true : false;
			};
			return predicate;
		}

	public static void main(String[] args) {

     Set <Integer> list = new HashSet<>();
     
     for(int i=1; i<=100; i++) {
    	 list.add((int) (Math.random()*1000)%100);
    	 }
     
     //Displaying all integers in list.
     System.out.println("Displaying all the integers");
     list.stream().forEach(System.out::println);
     System.out.println("********************************************************");
     
     //Displaying even numbers in list.
     System.out.println("Printing even Numbers");
     list.stream().filter(isEven()).forEach(System.out::println);
     System.out.println("********************************************************");
     
     
     //Displaying odd numbers in list.
     System.out.println("Printing odd Numbers");
     list.stream().filter(isOdd()).forEach(System.out::println);
     System.out.println("********************************************************");
     
     //Displaying numbers which are divisible by 6 in the list.
     System.out.println("Printing numbers divisible by 6");
     list.stream().filter(isDivisibleBy6()).forEach(System.out::println);
     System.out.println("********************************************************");
     
     //Displaying numbers which are less than 12 in the list.
     System.out.println("Printing numbers less than 12");
     list.stream().filter(isLessThan12()).forEach(System.out::println);
     System.out.println("********************************************************");
     
     //Displaying numbers which are greater than 50 in the list.
     System.out.println("Printing numbers greater than 50");
     list.stream().filter(isGreaterThan50()).forEach(System.out::println);

	}

}
