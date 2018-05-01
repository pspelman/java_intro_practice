public class SLLTester {

    public static void main(String[] args) {

        SinglyLinkedList SLL = new SinglyLinkedList();

        SinglyLinkedList.SLL mySLL = new SinglyLinkedList.SLL();

        mySLL.add(2);

        System.out.println("current head: " + mySLL.head);

        mySLL.add(4);
        System.out.println("current head: " + mySLL.head.value);

        mySLL.add(6);
//        System.out.println("current head: " + mySLL.head.value);
        mySLL.add(5);
        mySLL.add(2);
        mySLL.add(4);
        mySLL.add(3);


        mySLL.printValues();

        System.out.println("REMOVE TEST");
        mySLL.remove();
        mySLL.remove();
        mySLL.remove();
        mySLL.remove();
        mySLL.remove();
        mySLL.remove();


    }


}
