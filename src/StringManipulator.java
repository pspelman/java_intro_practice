public class StringManipulator {

    public static String trimAndConcat(String str_one, String str_two) {


        System.out.println(str_one.trim());

        System.out.printf("Strings to test: %s and %s%n", str_one, str_two);
        System.out.printf("Strings to test: %s and %s%n", str_one.trim(), str_two.trim());

        return str_one.trim() + str_two.trim();
    }


    public static int getIndexOrNull(String test_string, char search_char) {
        System.out.printf("testing '%s' for char: %s%n", test_string, search_char);
//        return (test_string.toLowerCase().indexOf(search_char) == -1) ? null : test_string.toLowerCase().indexOf(search_char);
        return test_string.toLowerCase().indexOf(search_char);
    }

    public static String concatSubstring(String str_one, int start_index, int end_index, String str_two) {
//        System.out.printf("Get substr from: %s starting at position %d - %d, and append it to %s", str_one, start_index, end_index, str_two);

        if (start_index == end_index) {
            return null;
        }
        if (start_index > end_index) {
            int temp = start_index;
            start_index = end_index;
            end_index = temp;

        }

        return str_one.substring(start_index, end_index) + str_two;
    }

}
