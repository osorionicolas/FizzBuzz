package fizzbuzz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.nosorio.fizzbuzz.manager.Manager;

class TestFizzBuzz {
	
	Manager manager = new Manager();

    @Test
    public void testFizz() {
    	Assert.assertEquals("Fizz", manager.verifyNumber(3));
    }
    
    @Test
    public void testBuzz() {
    	Assert.assertEquals("Buzz", manager.verifyNumber(5));
    }
    
    @Test
    public void testFizzBuzz() {
    	Assert.assertEquals("FizzBuzz", manager.verifyNumber(15));
    }
    
    @Test
    public void testNonFizzBuzz() {
    	Assert.assertEquals("1", manager.verifyNumber(1));
    }

}
