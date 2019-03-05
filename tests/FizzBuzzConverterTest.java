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
}