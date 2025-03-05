package homework;

public class DivisiblityChecker {

    public static String isItDivisible(int number){
        if (isItDivisibleBy5(number) == true && isItDivisibleBy3(number) == true){
            return "FizzBuzz";
        } else if (isItDivisibleBy5(number)) {
            return "Buzz";
        } else if (isItDivisibleBy3(number)) {
            return "Fizz";
        }
        return "None";
    }

    public static boolean isItDivisibleBy3(int number){
        return number % 3 == 0;
    }

    public static boolean isItDivisibleBy5(int number){
        return number % 5 == 0;
    }
}
