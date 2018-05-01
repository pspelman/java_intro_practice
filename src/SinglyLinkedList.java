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


        public Node find(double val) {
            //look for the val
            if (this.head == null) {
                System.out.println("No such value in list");
                return null;
            } else {
                Node runner = this.head;
                while (runner.next != null) {
                    if (runner.value == val) {
                        return runner;
                    } else {
                        runner = runner.next;
                    }
                }
                System.out.println("value not found in list");
                return null;
            }

        }


        boolean removeAt(int removal_position) {
            System.out.println("trying to remove node at removal_position: " + removal_position);
            if (removal_position == 0) {
                removal_position = 1;
            }
            if (this.head == null) {
                System.out.println("head is null...return");
                return false;
            } else {
                int counter = 1;
                Node runner = this.head;
                while (counter < removal_position) {
                    System.out.println("Counter < removal_position... counter: " + counter);
                    if (removal_position - 1 < counter && runner.next == null) {
                        System.out.println("The removal position is beyond the size of the list");
                        return false;
                    } else if (removal_position - 1 == counter) {      //the NEXT NODE is to be removed (if it's there)
                        System.out.println("removal_position - 1: " + (removal_position - 1) + " & counter: " + counter);
                        if (runner.next == null) {
                            System.out.println("no node at that position, ");
                            return false;
                        } else {                                //there IS a node at that removal_position...what about after it?
                            if (runner.next.next == null) {     //nothing after the removal position so point current runner's next to null
                                runner.next = null;
                                System.out.println("Successfully removed node at position: " + removal_position);
                                return true;
                            } else {                            //something came after the spot to remove, so point the current runner's .next at it (cut out the middle guy
                                runner.next = runner.next.next;
                                System.out.println("Successfully removed node at position: " + removal_position);
                                return true;
                            }
                        }
                    }
                    else {
                        if (runner.next == null) {
                            System.out.println("Reached end of list...it's not as long as you thought");
                            System.out.println("final length: " + counter);
                            return false;
                        } else {
                            runner = runner.next;
                            counter++;
                        }
                    }
                }

                }
                return false;
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
