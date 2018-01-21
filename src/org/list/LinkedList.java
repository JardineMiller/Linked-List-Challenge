package org.list;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList {
    private int numOfElements = 0;
    private Node head = null;

    public int size() {
        return numOfElements;
    }

    public int getHead() {
        return head.value;
    }

    public void insertToFront(int i) {
         Node newNode  = new Node(i);
         newNode.next = head;

         this.head = newNode;
         this.numOfElements++;
    }

    public void removeFromFront() {
        this.head = head.next;
        this.numOfElements--;
    }

    public Node get(int index) {
        Node node = this.head;
        for(int i = 0; i <= index - 1; i++) {
            node = node.next;
        }
        return node;
    }

    public void insertToEnd(int i) {
        if(numOfElements > 0) {
            Node newNode = new Node(i);
            Node lastNode = this.get(this.numOfElements - 1);
            lastNode.next = newNode;
            numOfElements++;
        } else {
            Node newNode  = new Node(i);
            newNode.next = head;

            this.head = newNode;
            this.numOfElements++;
        }
    }

    public void removeFromEnd() {
        Node penultimateNode = this.get(numOfElements - 2);
        penultimateNode.next = null;
        numOfElements--;
    }

    public void remove(int index) {
        Node before = get(index - 1);
        Node after = get(index + 1);

        before.next = after;
        numOfElements--;
    }

}
