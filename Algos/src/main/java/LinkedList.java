import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedList {

    private Node head;

    public void populateLinkedList(List<Integer> integers) {
        for (Integer integer : integers) {
            push(integer);
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public void removeSortedDuplicate() {
        Node curr = head;
        while (curr != null) {
            Node temp = curr;
            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
    }

    public void removeUnsortedDuplicates(Node head) {
        Node current = head;
        Node previous = null;
        final Set<Integer> integerSet = new HashSet<>();

        while (current != null) {
            int currentValue = current.data;
            if (integerSet.contains(currentValue)) {
                previous.next = current.next;
            } else {
                integerSet.add(currentValue);
                previous = current;
            }
            current = current.next;
        }
    }

    public void printList(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}

