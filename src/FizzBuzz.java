public class FizzBuzz {

    //    FizzBuzz
//Write a program that will take an integer and
// print Fizz if the number is divisible by 3,
// print Buzz if the number is divisible by 5,
// print FizzBuzz if the number is divisible by 3 and 5,
// print the number itself for all other cases.
    public static String printFizzBuzz(int num) {
        String fizz_or_buzz_or_num = null;

//        System.out.printf("Num to test: %d", num);
        if ((num % 3 == 0) && (num % 5 != 0)) {
            System.out.printf("%d is divisible by 3... Fizz", num );

        } else if ((num % 5 == 0) && (num % 3 != 0)) {
            System.out.printf("%d is divisible by 5... Buzz", num);
        } else if ((num % 5 == 0) && (num % 3 == 0)) {
            System.out.printf("%d is divisible by 3 AND 5...FizzBuzz", num);
        } else{
            System.out.printf("%d is boring...", num);
        }


        return fizz_or_buzz_or_num;
    }



}
