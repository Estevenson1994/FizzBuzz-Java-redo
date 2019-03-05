import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzConverterTest {

  private FizzBuzzConverter fizzBuzz;

  @Test
  public void converterReturnsOneWhenGivenOne() {
      this.fizzBuzz = new FizzBuzzConverter();
      assertEquals("1", fizzBuzz.convert(1));
  }

   @Test
   public void converterReturnsFizzWhenGivenThree() {
       this.fizzBuzz = new FizzBuzzConverter();
       assertEquals("Fizz", fizzBuzz.convert(3));
   }

    @Test
    public void converterReturnsBuzzWhenGivenFive() {
        this.fizzBuzz = new FizzBuzzConverter();
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void converterReturnsFizzBuzzWhenGivenFifteen() {
        this.fizzBuzz = new FizzBuzzConverter();
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }
}