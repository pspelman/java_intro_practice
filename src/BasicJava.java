public class BasicJava {

    public static void main(String[] args) {

        printInts();
        printSum();

//        int sample[] = {1, 2, 3, 4};
//        iterArray(sample);
        iterArray(new int[]{1, 2, 3, 4, 10, 15});

        System.out.printf("Max: %d%n", findMax(new int[]{0, 1, 2, 3, 10, 6, 5, 4, 13}));

        System.out.printf("Average: %f%n", findAverage(new double[]{2, 3, 4}));

        double testDoubleArray[] = {1, 2, 3, 4, 5, 7, 8, 9, 0};
        int testNumber = 6;

        System.out.printf("number of vals greater than %d : %d", testNumber, findValsGreaterThanY(testDoubleArray, testNumber));

        double testDoubleArrayToSquare[] = {1, 2, 3, 4};
        for (double item : squareValsInArray(testDoubleArrayToSquare)) {
            System.out.println(item);
        }

        int testIntArray[] = {-1, 2, 3, -4, 5, -6, 9, 10, -12};
        System.out.println("remove negs:");
        for (int item : replaceNegs(testIntArray)) {
            System.out.println(item);

        }


        double testShiftDoubles[] = {1, 2, 3, 4, 5, 7, 8, 9, 3};
        shiftLeftByOne(testShiftDoubles);

    }


    public static void printArray(double doubleArray[]) {
        System.out.print("[ ");
        for (double item : doubleArray) {
            System.out.print(item + ", ");
        }
        System.out.print("]");
    }


    public static void printInts() {
        for (int start_int = 1; start_int < 256; start_int++) {
            System.out.println(start_int);
        }
    }


    public static void printSum() {
        for (int start_int = 0, sum=0; start_int < 256; start_int++, sum += start_int) {
            System.out.printf("Number: %d | Sum: %d%n", start_int, sum);
        }
    }


    public static void iterArray(int intArray[]) {
        for (int item : intArray) {
            System.out.println(item);
        }
    }


    public static int findMax(int intArray[]) {
        int max = 0;
        boolean initialized = false;

        for (int item : intArray) {
            if (!initialized) {
                System.out.printf("initializing max: %d%n", item);
                max = item;
                initialized = true;
            } else if (max < item) {
                System.out.printf("new max: %d%n", item);
                max = item;
            }
        }
        return max;
    }


    public static double getArraySum(double doubleArray[]) {
        double sum = 0;
        for (double item : doubleArray) {
            sum += item;
        }
        return sum;
    }

    public static double findAverage(double doubleArray[]) {
        return (getArraySum(doubleArray) / doubleArray.length);

    }


    public static int findValsGreaterThanY(double doubleArray[], double y) {
        int count = 0;

        for (double item : doubleArray) {
            if (item > y) {
                count ++;
            }
        }
        return count;
    }


    public static double[] squareValsInArray(double doubleArray[]) {

        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = doubleArray[i]*doubleArray[i];
        }
        return doubleArray;
    }

    public static int[] replaceNegs(int intArray[]) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 0) {
                intArray[i] = 0;
            }
        }
        return intArray;
    }

    public static double[] shiftLeftByOne(double doubleArray[]) {
        System.out.printf("%nInitial array:");
        printArray(doubleArray);


        for (int i = 0; i < doubleArray.length-1; i++) {
            doubleArray[i] = doubleArray[i + 1];
        }
        doubleArray[doubleArray.length - 1] = 0;
        System.out.printf("%nending array: ");
        printArray(doubleArray);
        return doubleArray;
    }


}
