package CODES.LINKED_LIST.StriversLL;

public class AddTwoNumbers {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertLast(2);
        l1.insertLast(4);
        l1.insertLast(3);

        LinkedList l2 = new LinkedList();
        l2.insertLast(5);
        l2.insertLast(6);
        l2.insertLast(7);
        l2.insertLast(9);

        l2.addTwoNumbers(l1.head, l2.head);
        l2.display();
    }
}
