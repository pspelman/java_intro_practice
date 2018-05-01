public class SLLTester {

    public static void main(String[] args) {

//        SinglyLinkedList SLL = new SinglyLinkedList();

        SinglyLinkedList.SLL mySLL = new SinglyLinkedList.SLL();

        mySLL.add(2);
        System.out.println("current head: " + mySLL.head.value);
        mySLL.add(4);
        System.out.println("current head: " + mySLL.head.value);

        mySLL.add(6);
//        System.out.println("current head: " + mySLL.head.value);
        mySLL.add(5);
        mySLL.add(2);
        mySLL.add(4);
        mySLL.add(3);


        mySLL.printValues();

        System.out.println();
        System.out.println("trying to find 4: ");
        SinglyLinkedList.Node foundNode = mySLL.find(4);
        System.out.println("trying to find 8: ");
        SinglyLinkedList.Node foundNode2 = mySLL.find(8);
        System.out.println();

        System.out.println("REMOVE AT TEST");
//        mySLL.removeAt(8);
        mySLL.printValues();

        mySLL.removeAt(6);
        mySLL.printValues();


//        System.out.println("REMOVE TEST");
//        mySLL.remove();
//        mySLL.remove();
//        mySLL.remove();
//        mySLL.remove();
//        mySLL.remove();
//        mySLL.remove();


    }


}
