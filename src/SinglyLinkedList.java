public class SinglyLinkedList {
    public static void main(String[] args) {

//        SLL mySLL = new SLL();
//
//        mySLL.add(2);
//
//        System.out.println("current head: " + mySLL.head);
//
//        mySLL.add(4);
//        System.out.println("current head: " + mySLL.head.value);
//
//        mySLL.add(6);
////        System.out.println("current head: " + mySLL.head.value);
//        mySLL.add(5);
//        mySLL.add(3);
//
//        mySLL.printValues();
//
//        System.out.println("REMOVE TEST");
//        mySLL.remove();
//        mySLL.remove();
//        mySLL.remove();
//        mySLL.remove();
    }

    static class SLL {
        Node head;

        public SLL() {
            this.head = null;
        }

        public void add(double val) {
            System.out.println("trying to add: " + val);
            // what am I adding? --answer: A new node
            Node newNode = new Node(val); //now we have a new node...floating in space

            // where am I adding? - need to check if there's anything at the head
            if (this.head == null) {
                System.out.println("head was null...adding val to head: " + val);
                this.head = newNode;
            } else {                    //this means there's already a head
                System.out.println("head not null...finding the end of the list...");
                Node runner = this.head;
                while (runner.next != null) {
                    System.out.println("runner val: " + runner.value);
                    runner = runner.next;
                }
                System.out.println("found the end value: " + runner.value);
                System.out.println("now adding: " + val);
                runner.next = newNode;
            }
        }

        public void remove() {
            System.out.println("trying to remove the final node");
            if (this.head == null) {
                System.out.println("empty list");
            } else if (this.head.next == null) {
                this.head = null;
                System.out.println("removed only node in list. Done.");
            } else {
                Node runner = this.head;
                while (runner.next.next != null) {
                    runner = runner.next;
                }
                System.out.println("removing final node: " + runner.next.value);
                runner.next = null;
            }
        }

        public void printValues() {
            Node runner = this.head;
            if (this.head.next == null) {
                System.out.println(runner.value);

            } else {
                System.out.print("[ ");
                System.out.print(runner.value +  ", ");
                while (runner.next != null) {
                    runner = runner.next;
                    System.out.print(runner.value + ", ");
                }
                System.out.print(" ]");
                System.out.println();
            }
        }
    }

    static class Node {
        double value;
        Node next;

        public Node(double value) {
            this.value = value;
            this.next = null;
        }
    }


}
