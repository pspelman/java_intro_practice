import com.sun.tools.hat.internal.util.ArraySorter;

import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJava {
    public static void main(String[] args) {
//
//        ArrayList marks = new ArrayList();
//        Double sum = 0.0;
//        sum = ((Double)marks.get(i));
//
//        int     a = 1;
//        int[]     aArr = {1};
//        Integer b = 1;   // unboxing, requires Java 1.5+
//        Integer[] bArr = {1};
//
//
//        double  c = (double) a;   // OK
//        double[] cArr = (double) ((Integer)aArr.get());
//
//        Double  d = (Double) b;   // No way.
//
//
//        sum = (double) ((Integer) marks.get(i)).intValue();

//        int testVals[] = new int[]{3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
//        Double testVals[] = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
//        printArrayItems(Arrays.copyOf(testVals, testVals.length, Integer[].class));
//TODO #1:
        int[] testVals = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        printArrayItems(testVals);

        ArrayList<Integer> testers = printAllAndReturnValsGreaterThanTen(testVals);
        printArrayListItems(testers);


//TODO #2:
// make array of names: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa.
// shuffle array
// print name of each person
// return array w/name longer than 5 char
        String[] namesArray = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println("original names array:");
        printStringArray(namesArray);
        System.out.println("Shuffled names, greater than 5 characters:");
        printStringArray(shufflestrings(namesArray));

//TODO #3:
// make array with 26 letters of alphabet (array must have 26 values)
// shuffle the array and
        char[] alphabetArray = getAlphabetArray();
        for (int i = 0; i < alphabetArray.length; i++) {
            System.out.print(" " + alphabetArray[i]);
        }
        shuffleChars(alphabetArray);
        System.out.println();
        for (int i = 0; i < alphabetArray.length; i++) {
            System.out.print(" " + alphabetArray[i]);
        }

        System.out.printf("%nFirst letter: %s %nLast letter: %s%n", alphabetArray[0], alphabetArray[25]);
        char[] vowels = {'a','A', 'e','E', 'i', 'I', 'o', 'O', 'u', 'U'};

        //        String.valueOf((char)b).toLowerCase();

//        System.out.println("PRINT STRING OF CHAR: " + String.valueOf(alphabetArray[25]) );

        for (char letter : vowels) {
            if (alphabetArray[0] == letter) {
                System.out.println("FIRST LETTER IS A VOWEL!!!: " + letter);
            }
        }
// display the last letter of the array
// display the first letter of the array
// if the first letter of array is a vowel, display a message


//TODO #4:
// GENERATE and RETURN an array with 10 random numbers between 55-100
        int[] randomTen = randIntArray(10, 55, 100);

//TODO #5:
// Generate and return array with 10 random numbers between 55-100
    int[] sortedTen = sortNums(randomTen);
    System.out.printf("%nMin: %d%n Max: %d%n", sortedTen[0], sortedTen[sortedTen.length-1]);
// Sort the array SMALLEST to LARGEST
// Display Minimum
// Display Maximum

//TODO #6:
// Generate random string 5 characters long (probably just create function for this)
        String randString = getRandomString(5);



//TODO #7:
// Generate array with 10 random strings each 5 characters long
        String[] randStringArray = getRandomStringArray(10, 5);
        printStringArray(randStringArray);




    }

    private static String[] getRandomStringArray(int numStrings, int strLength) {
        String[] randStringArray = new String[numStrings];
        for (int i = 0; i < randStringArray.length; i++) {
            randStringArray[i] = getRandomString(strLength);
        }
        return randStringArray;
    }

    private static String getRandomString(int strLength) {
        String randString = "";
        for (int i = 0; i < strLength; i++) {
            randString += (char) getRandIntBetween(55, 100);
        }
        System.out.println("rand string: " + randString);
        return randString;
    }

    private static int[] sortNums(int[] randomTen) {
        int[] sortedNumsArray = Arrays.copyOf(randomTen, randomTen.length);
        for (int num : randomTen) {
            System.out.printf("%d, ", num);
        }
        System.out.println();

        Arrays.sort(sortedNumsArray);
        for (int num : sortedNumsArray) {
            System.out.printf("%d, ", num);
        }
        return sortedNumsArray;
    }

    private static int[] randIntArray(int n_numbers, int min, int max) {
        int[] randNums = new int[n_numbers];
        for (int i = 0; i < randNums.length; i++) {
            randNums[i] = getRandIntBetween(min, max);
        }
//        for (int num : randNums) {
//            System.out.println(num);
//        }

        return randNums;
    }

    private static char[] shuffleChars(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            int position_one = getRandIntBetween(0, charArray.length-1);
            int position_two = getRandIntBetween(0, charArray.length-1);
            char temp = charArray[position_one];
            charArray[position_one] = charArray[position_two];
            charArray[position_two] = temp;
        }

        return charArray;
    }

    private static char[] getAlphabetArray() {
//        String.valueOf((char)b).toLowerCase();
        char[] alphabetArray = new char[26];
        for (int i = 0, letter = (char)65; i < 26; i++, letter++) {
//            System.out.println((char) letter);
            alphabetArray[i] = (char)letter;
        }

        return alphabetArray;
    }

    private static String[] shufflestrings(String[] namesArray) {
//        printStringArray(namesArray);
                //use the original array for shuffling
        String[] shuffledStrings = new String[0];

        ArrayList<String> namesGreaterThanFiveChars = new ArrayList<>();


        //get a random number
        //randomly pick 2 places in the array N [array.length) times and switch them
        //number needs to be between 0 and the max length
        //number COULD be the same, who cares?
        //need temp variable
        for (int i = 0; i < namesArray.length; i++) {
            int position_one = getRandIntBetween(0, namesArray.length-1);
            int position_two = getRandIntBetween(0, namesArray.length-1);
//            System.out.println("pos one: " + position_one);
//            System.out.println("pos two: " + position_two);
            String temp = namesArray[position_one];
            namesArray[position_one] = namesArray[position_two];
            namesArray[position_two] = temp;
        }
//        printStringArray(namesArray);

        for (String name : namesArray) {
            if (name.length() > 5) {
                namesGreaterThanFiveChars.add(name);
            }
        }
        String[] finalNamesList = new String[namesGreaterThanFiveChars.size()];
        for (int i = 0; i < finalNamesList.length; i++) {
            finalNamesList[i] = namesGreaterThanFiveChars.get(i);
        }

        return finalNamesList;
    }



    private static int getRandIntBetween(int lower_limit, int upper_limit) {
        return (int) Math.floor((Math.random() * (upper_limit - lower_limit + 1) + lower_limit));
    }



    private static void printStringArray(String[] arrayOfStrings) {
        System.out.print("Array of strings: [ " );
        for (int i = 0; i < arrayOfStrings.length-1; i++) {
            System.out.print("" + arrayOfStrings[i] + ", ");
        }
        System.out.print(arrayOfStrings[arrayOfStrings.length-1]+ " ]");
        System.out.println();
    }

    private static void printArrayListItems(ArrayList<Integer> printArray) {
        System.out.print("[ ");
        for (int i = 0; i < printArray.size()-1; i++) {
            System.out.print(printArray.get(i) + ", ");
        }
        System.out.print(printArray.get(printArray.size()-1)+ " ]");
        System.out.println();
    }


    public static void printArrayItems(int[] printArray) {
        System.out.print("[ ");
        for (int i = 0; i < printArray.length-1; i++) {
            System.out.print(printArray[i] + ", ");
        }
        System.out.print(printArray[printArray.length-1]+ " ]");
        System.out.println();
    }


    public static ArrayList<Integer> printAllAndReturnValsGreaterThanTen(int[] valsArray) {
        //todo: print sum of all numbers
        //loop and get sum
        int sum = 0;

        ArrayList<Integer> greaterThanTen = new ArrayList<>();

        for (int i = 0; i < valsArray.length; i++) {
            sum += valsArray[i];

            if (valsArray[i] > 10) {
                greaterThanTen.add(valsArray[i]);
            }
        }
        System.out.println("SUM: " + sum);
        return greaterThanTen;
    }

}
