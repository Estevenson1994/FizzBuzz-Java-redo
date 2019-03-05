public class FizzBuzzConverter {
    public String convert(int number) {
        if (number%3==0) {
            return "Fizz";
        }
        else {
            return String.valueOf(number);
        }
    }
}
