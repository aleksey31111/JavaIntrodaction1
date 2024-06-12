package Part_1_IntroductionInJava.lecture_14_Generic_myselfRealization_LinkedList_meetCollection.ownImplementation_LinkedList;

public class CustomLinkedList<Element> {
    private Node<Element> first;
    private Node<Element> last;

    public void add(Element element) {
        if (first == null) {
            Node<Element> node = new Node<>(element, null, null);
            first = node;
            last = node;
        } else {
            Node<Element> node = new Node<>(element, null, last);
        }
    }

    public static class Node<Element> {
        Element item;
        Node<Element> next;
        Node<Element> prev;

        public Node(Element item, Node<Element> next, Node<Element> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

}
