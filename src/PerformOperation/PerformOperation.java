package PerformOperation;

import java.util.function.Predicate;

//Perform operations using Lambda Expression.
public class PerformOperation {

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

	// Checking if the number is palindrome using Predicate.
	public static Predicate<Integer> isPalindrome() {
		Predicate<Integer> predicate = (number) -> {
			return (Integer.toString(number)).equals(new StringBuilder(Integer.toString(number)).reverse().toString());
		};
		return predicate;
	}
}
