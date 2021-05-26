package com.nosorio.fizzbuzz;


import java.util.stream.IntStream;

public class FizzBuzz {
	
	private static String FIZZ = "Fizz";
	private static String BUZZ = "Buzz";
	
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100)
				 .boxed()
				 .forEach(number -> System.out.println(verifyNumber(number)));	
	}
	
	public static String verifyNumber(Integer number) {
		String response = fizz(number) + buzz(number);
		return response.isEmpty() ? number.toString() : response;
	}
	
	private static String fizz(Integer number) {
		return number % 3 == 0 ? FIZZ : "";
	}
	
	private static String buzz(Integer number) {
		return number % 5 == 0 ? BUZZ : "";
	}
}
