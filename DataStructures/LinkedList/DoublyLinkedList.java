public class DoublyLinkedList {
    
    Node head = null;
    
    public void insert(int data) {
        Node nody = new Node();
        nody.data = data;
        nody.next = null;
        nody.prev = null;
        // nody.prev = null;

        if(head == null) {
            head = nody;
        } else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = nody;
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
