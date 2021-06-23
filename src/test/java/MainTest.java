import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void shouldCalculateArea(){
        double area = Main.areaOfTriangle(5,2);
        assertEquals(5,area,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException(){
        Main.areaOfTriangle(-5,2);
    }

    @Test
    public void shouldReturnTrueIfOdd(){
        assertTrue(Main.isOdd(1));
    }

    @Test
    public void shouldReturnFalseIfEven(){
        assertFalse(Main.isOdd(2));
    }

     @Test
    public void shouldReturnCorrectString(){
        String expected  = "Hello Linda! Your friend Zane invited you to join this app!";
        String result = Main.personalizedGreeting("Linda","Zane");
        assertEquals(expected,result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfNameIsEmpty() {
        Main.personalizedGreeting("","");
    }

     @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfNameIsNull() {
        Main.personalizedGreeting(null,null);
    }

      @Test
    public void shouldReturnTrueIfPrime(){
       assertTrue(Main.isPrime(7));
    }

    @Test
    public void shouldReturnFalseIfNotPrime(){
       assertFalse(Main.isPrime(6));
    }

    @Test
    public void shouldGeneratePrimes(){
        List<Integer> expected  = Arrays.asList(2, 3, 5, 7);
        List<Integer> result = Main.generatePrimes(4);
        assertEquals(expected,result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfRequestedAmountInvalid() {
        Main.primeNumbers(0);
    }





}
