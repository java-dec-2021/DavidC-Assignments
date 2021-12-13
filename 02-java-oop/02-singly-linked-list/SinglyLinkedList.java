public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    private boolean isEmpty() {
        return this.head == null;
    }

    public void remove() {
        Node runner = head;

        //Empty List
        if( isEmpty() )
            System.out.println("Empty List");

        //List with one node
        if(head.next == null) {
            head = null;
        }

        // otherwise, loop til we are right before the last node
        while(runner.next.next != null) {
            runner = runner.next;
        }
        runner.next = null;
    }

    public void printValues() {
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node runner = this.head;
        while(runner.next != null) {
            System.out.println("Node Value: " + runner.value);
            runner = runner.next;
        }
        System.out.println("Node Value: " + runner.value);
    }
}