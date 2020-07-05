package com.nosorio.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
	
	private static String FIZZ = "Fizz";
	private static String BUZZ = "Buzz";
	private static String FIZZBUZZ = "FizzBuzz";
	
    private static List<Integer> arrayInteger = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

	public static void main(String[] args) {
        arrayInteger.stream().forEach(number -> System.out.println(verifyNumber(number)));	
	}
	
	public static String verifyNumber(Integer number) {
		if(fizz(number) && buzz(number)) {
			return FIZZBUZZ;
		}
		else if(fizz(number)) {
			return FIZZ;
		}
		else if(buzz(number)) {
			return BUZZ;
		}
		else {
			return number.toString();
		}
	}
	
	private static Boolean fizz(Integer number) {
		return number % 3 == 0;
	}
	
	private static Boolean buzz(Integer number) {
		return number % 5 == 0;
	}
}
