public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertHead(4);
        list.insertHead(43);
        list.insertHead(21234);
        list.insertHead(35);
        list.insertTail(15);
        list.Insert(3, 22);
        list.DeleteAt(0);
        list.DeleteAt(3);
        list.DeleteAt(8);
        list.DeleteTail();
        list.display();        
    }
}
