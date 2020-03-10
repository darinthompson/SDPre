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

    public void DeleteHead() {
        if(head == null) {
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void DeleteTail() {
        if(tail == null) {
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    public void DeleteAt(int pos) {
        int counter = 0;
        Node current = head;
        while(counter <= pos - 1) {
            if(current == null) {
                return;
            }
            current = current.next;
            counter++;
        }
        
        if(current == head) {
            DeleteHead();
        } else if(current == tail) {
            DeleteTail();
        } else {
            current.next.prev = current.prev;
            current.prev.next = current.next;
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
