package com.nosorio.fizzbuzz.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Manager {
	
	private static String FIZZ = "Fizz";
	private static String BUZZ = "Buzz";
	private static String FIZZBUZZ = "FizzBuzz";
	
	private List<Integer> arrayInteger;
	private List<String> stringList;
	
	public Manager() {
		arrayInteger = new ArrayList<Integer>();
		stringList = new ArrayList<String>();
	}

	public void Run() {
		this.fillList();
		System.out.println("Integer Array: " + arrayInteger);

		for(Integer number : arrayInteger) {
			stringList.add(this.verifyNumber(number));
		}
		
		System.out.println("String Array: " + stringList);
	}
	
	private void fillList() {
        for(int i = 0; i < 10; i++){
        	this.arrayInteger.add((int)(new Random().nextInt(50) + 1));
        }
	}
	
	public String verifyNumber(Integer number) {
		if(number % 3 == 0 && number % 5 == 0) {
			return FIZZBUZZ;
		}
		else if(number % 3 == 0) {
			return FIZZ;
		}
		else if(number % 5 == 0) {
			return BUZZ;
		}
		else {
			return number.toString();
		}
	}
}
