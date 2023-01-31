package com.blz.linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if(tail == null) {
            tail = head;
        }
        size++;
        return;
    }
    public void addLast(int data) {
        if(tail == null) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        size++;
        return;
    }
    public void add(int data, int index) {
        if(index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        Node currentNode = head;
        for (int i=1; i<index; i++) {
            currentNode = currentNode.next;
        }
        Node newNode = new Node(data, currentNode.next);
        currentNode.next = newNode;
        size++;
        return;
    }
    public void deleteFirst() {
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return;
    }
    public void deleteLast() {
        if(size == 1) {
            deleteFirst();
            return;
        }
        if(size == 0) {
            System.out.println("List is Empty");
            return;
        }
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;
        size--;
        return;
    }
    public void delete(int index) {
        if(index == 0) {
            deleteFirst();
            return;
        }
        if(index == size - 1) {
            deleteLast();
            return;
        }
        Node newNode = get(index - 1);
        newNode.next = newNode.next.next;
        size--;
        return;
    }

    public Node get(int index) {
        Node newNode = head;
        for (int i=0; i<index; i++) {
            newNode = newNode.next;
        }
        return newNode;
    }
    public Node find(int data) {
        Node currentNode = head;
        while(currentNode.next != null) {
            if(currentNode.data == data) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        System.out.println("Number not found");
        return null;
    }
    public void display() {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
        return;
    }
    public int getSize(){
        return size;
    }

}
