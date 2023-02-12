package CODES.LINKED_LIST.StriversLL;

public class ReverseNodesInKGrp {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertLast(1);
        l.insertLast(2);
        l.insertLast(3);
        l.insertLast(4);
        l.insertLast(5);
        l.insertLast(6);
        l.insertLast(7);
        l.insertLast(8);


        l.reverseKGroup(l.head, 3);
        l.display();
    }
}
