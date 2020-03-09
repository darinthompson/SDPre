public class DoublyLinkedList {

    Node head = null;
    Node tail = null;

    public void insertHead(int data) {
        Node nody = new Node();
        nody.data = data;
        nody.next = null;
        nody.prev = null;
        // nody.prev = null;

        if(head == null) {
            head = nody;
            tail = nody;
        } else {
            nody.next = head;
            head.prev = nody;   
            head = nody;
        }
    }

    public void insertTail(int data) {
        Node nody = new Node();
        nody.data = data;
        nody.next = null;

        if(tail == null) {
            head = nody;
            tail = nody;
        } else {
            nody.prev = tail;
            tail.next = nody;
            tail = nody;
        }
    }

    public void Insert(int pos, int data) {
        Node nody = new Node();
        nody.data = data;

        int counter = 0;

        Node current = head; 
        while(counter <= pos - 1) { // -1 makes sure the data is inserted at the correct place in the list
            if(current == null) {
                return;
            }
            current = current.next;
            counter++;
        }

        if(current == head) {
            insertHead(data);
        } else if(current == tail) {
            insertTail(data);
        } else {
           nody.prev = current.prev;
           nody.next = current;
           current.prev.next = nody;
           current.prev = nody;
        }
    }

    public void display() {
        Node current = head; 
        current = head;
        current.next = head.next;
        while(current.next != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }
}
