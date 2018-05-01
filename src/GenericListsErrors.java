import java.util.ArrayList;

public class GenericListsErrors {
    public static void main(String[] args) {
        System.out.println("HELLO");

        ArrayList<Object> myList = new ArrayList<Object>();


        //using the Integer and String types will prevent compilation when someone attempts to add the wrong datatype to the list
        ArrayList<Integer> myIntList = new ArrayList<Integer>();
        ArrayList<String> myStringList = new ArrayList<String>();


        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye WOrld");





//        for (Object item : myList) {
////            System.out.println(item);
//            try {
//                Integer castedItem = (Integer) item;
//                System.out.println("Success: " + castedItem);
//
//            } catch (Exception e) {
//                System.out.println("Fail: " + item + " | Error: " + e);
//            }
//        }

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedItem = (Integer) myList.get(i);
                System.out.println("Success: " + castedItem);

            } catch (Exception e) {
                System.out.println("Fail: " + myList.get(i));
            }
//            continue;

        }


    }
}
