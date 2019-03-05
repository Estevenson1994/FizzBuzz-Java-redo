import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzConverterTest {

  private FizzBuzzConverter fizzBuzz;

  @Test

    public void converterReturnsOneWhenGivenOne() {
       this.fizzBuzz = new FizzBuzzConverter();
      assertEquals("1", fizzBuzz.convert(1));
  }

}