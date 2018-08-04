package PerformOperation;

import java.util.ArrayList;

//Test Class
public class TestOperation {

	public static void main(String[] args) {

		// Creating list of arraylist
		ArrayList<Integer> list = new ArrayList<>();

		// Populating the list
		for (int i = 1; i <= 100; i++) {
			list.add(i);
		}

		// Calling method to print odd numbers.
		System.out.println("Printing odd Numbers b/w 1 to 100");
		list.stream().filter(PerformOperation.isOdd()).forEach(System.out::println);

		System.out.println("********************************************************");

		// Calling method to print even numbers.
		System.out.println("Printing Even Numbers b/w 1 to 100");
		list.stream().filter(PerformOperation.isEven()).forEach(System.out::println);

		System.out.println("********************************************************");

		// Calling
		System.out.println("Printing Palindrome b/w 1 to 100");
		list.stream().filter(PerformOperation.isPalindrome()).forEach(System.out::println);
	}

}
