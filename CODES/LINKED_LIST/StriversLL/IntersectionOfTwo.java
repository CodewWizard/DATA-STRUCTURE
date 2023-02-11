package CODES.LINKED_LIST.StriversLL;

public class IntersectionOfTwo {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.insertLast(4);
        l1.insertLast(1);
        l1.insertLast(8);
        l1.insertLast(4);
        l1.insertLast(5);

        LinkedList l2 = new LinkedList();

        l2.insertLast(5);
        l2.insertLast(6);
        l2.insertLast(1);
        l2.insertLast(8);
        l2.insertLast(4);
        l2.insertLast(5);
        l1.display();
        l2.display();

        System.out.println(l1.getIntersectionNode(l1.head, l2.head));
    }
}
