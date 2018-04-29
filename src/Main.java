
public class Main {


    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("This is a new line");


        ImportDemo Demo = new ImportDemo();
        String currentDate = Demo.getCurrentDate();

        System.out.println(currentDate);

        Pythagorean riTri = new Pythagorean();

        double side_a = 4;
        double side_b = 5;
        double hypot = riTri.getHypotenuse(side_a, side_b);
        System.out.printf("Hypot of %.2f and %.3f: %.5f", side_a, side_b, hypot);

//        System.out.println(riTri.getHypotenuse(4, 5));


        //try to cast int to byte
        int i = 128;
//        byte b = i; //this will give error

        //cast it
        byte b = (byte) i;

        //what happens if the integer is beyond the range of a byte?
        int l = 130;
        byte p = (byte) l;

        //implicit casting
        byte a = 127;
        int s = a;

        SearchForStringInString strTest = new SearchForStringInString();

        System.out.println();
        System.out.println(strTest.containsString("PHIL", "HELLO THIS IS PHIL'S STRING THING"));

//        System.out.printf("");

        FizzBuzz fBuzz = new FizzBuzz();

        int numbersArray[] = {1, 2, 3, 4, 5, 10, 15, 12, 20, 21, 24, 25, 27, 30};

        for (int num : numbersArray) {
//            System.out.printf("N:%d%n", n);
            fBuzz.printFizzBuzz(num);
            System.out.println();

        }
//
//        fBuzz.printFizzBuzz(22);
//        fBuzz.printFizzBuzz(22);
//        fBuzz.printFizzBuzz(22);
//        fBuzz.printFizzBuzz(22);


        StringManipulator strMan = new StringManipulator();

        System.out.println(strMan.trimAndConcat("    pop    ", "    shoe     "));


        String test_word = "Codingleberry";
        char test_char = 'c';
        System.out.println(strMan.getIndexOrNull(test_word, test_char));
        System.out.println(strMan.getIndexOrNull(test_word, 'd'));
        System.out.println(strMan.getIndexOrNull(test_word, 'z'));


        String str_one = "Hello";
        String str_two = "ThingsAndStuff";
        int start_idx = 2;
        int end_idx = 5;

        System.out.println(strMan.concatSubstring(str_one, start_idx, end_idx, str_two));


    }

}

//class SomeDemo {
//    public String getCurrentDate() {
//        Date date = new Date();
//        return "Current date: " + date;
//    }
//
//}
