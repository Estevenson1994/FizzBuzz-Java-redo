import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzConverterTest {

  private FizzBuzzConverter fizzBuzz;

  @Before
  public void beforeEachTestMethod() {
      this.fizzBuzz = new FizzBuzzConverter();
  }

  @Test
  public void converterReturnsOneWhenGivenOne() {
      assertEquals("1", fizzBuzz.convert(1));
  }

   @Test
   public void converterReturnsFizzWhenGivenThree() {
       assertEquals("Fizz", fizzBuzz.convert(3));
   }

   @Test
   public void converterReturnsBuzzWhenGivenFive() {
      assertEquals("Buzz", fizzBuzz.convert(5));
   }

   @Test
   public void converterReturnsFizzBuzzWhenGivenFifteen() {
      assertEquals("FizzBuzz", fizzBuzz.convert(15));
   }

   @Test
    public void allMutliplesOfThreeButNotFiveGiveFizz() {
      for (int i = 1; i <= 100; i++) {
          if ((i % 3 == 0) && !(i % 5 == 0)) {
              assertEquals("Fizz", fizzBuzz.convert(i));
          }
      }
   }
}