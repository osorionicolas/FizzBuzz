package fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.nosorio.fizzbuzz.FizzBuzz;

class TestFizzBuzz {
	
    @Test
    public void testFizz() {
    	Assertions.assertEquals("Fizz", FizzBuzz.verifyNumber(3));
    }
    
    @Test
    public void testBuzz() {
    	Assertions.assertEquals("Buzz", FizzBuzz.verifyNumber(5));
    }
    
    @Test
    public void testFizzBuzz() {
    	Assertions.assertEquals("FizzBuzz", FizzBuzz.verifyNumber(15));
    }
    
    @Test
    public void testNonFizzBuzz() {
    	Assertions.assertEquals("1", FizzBuzz.verifyNumber(1));
    }

}
