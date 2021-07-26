package com.example.dell;

public class DoublyLinkedList {
    Node head;
    Node tial;
    int size;

    public DoublyLinkedList() {
        this.head = head;
        this.tial = tial;
    }

    public void addNode(int value) {
        Node newNode = new Node(value);
        Node current = head;
        if (head.equals(null)) {
            head = newNode;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.previous = current;
        size++;
    }

    public void printValuesBackward() {
        Node ccrunt = head;
        while (ccrunt != null) {
            System.out.println(ccrunt.value);
            ccrunt = ccrunt.next;
        }
        while (ccrunt != null) {

            ccrunt = ccrunt.previous;
        }
    }

    public Node pop() {
        if (tial == null) {
            System.out.println("No any node ");
        }
        return tial;
    }

    public boolean contains(Integer value) {
        Node current = head;
        while (current.next != null) {
            if (current.getValue() == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void insertAt(Node newNode, int index) {

        Node r = new Node(index);
        r.next = head;
        head = r;
        if (head == null) {
            head = new Node(20);
        } else {
            Node h = new Node(40);
            head.previous = h;
            head = h;
        }

    }

    public void removeAt(int index) {
        if (head == null) {
            Node d = head;
            if (index == 0) {
                head = d.next;
                return;
            }
            for (int q = 0; d != null && q < index - 1; q++) {
                d = d.next;
                if (d == null || d.next == null) {
                    Node next = d.next.next;
                    d.next = next;
                }

            }
        }
    }
}

