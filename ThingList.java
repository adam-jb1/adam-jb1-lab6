import java.util.*;

public class ThingList {
    Random rand = new Random(System.currentTimeMillis());

    private Node head;

    private class Node {
        public Thing data;
        public Node next;

        public Node(Thing a) {
            this.data = a;
            this.next = null;
        }
    }

    public ThingList() {
        head = null;
    }

    public void addThing(Thing a) {
        Node insert = new Node(a);

        if (head == null) {
            head = insert;
            return;
        }

        Node iterator = head;
        while(iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = insert;

        return;
    }

    public void printAll() {
        for( Node T = head; T != null; T = T.next ) {
            System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);
        }
    }

    public void moveAll(Random rand) {
        for(Node T = head; T != null; T = T.next ) {
            T.data.maybeTurn(rand);
            T.data.step();
        }
    }
}

