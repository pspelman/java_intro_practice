public class SearchForStringInString {

    public static boolean containsString(String find_target, String string_to_test) {
        System.out.printf("String to test: %s for %s%n", string_to_test, find_target);
        return string_to_test.contains(find_target);
//        return false;
    }

}


