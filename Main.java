package com.blz.linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(8);
        list.addFirst(57);
        list.addLast(99);
        list.addLast(101);
        list.add(149, 2);
        System.out.println("list display after all add operations");
        list.display();
        System.out.println("Size of list = " + list.getSize());
        System.out.println("after delete first");
        list.deleteFirst();
        list.display();
        System.out.println("Size of list = " + list.getSize());
        System.out.println("after delete last");
        list.deleteLast();
        list.display();
        System.out.println("Size of list = " + list.getSize());
        System.out.println("After delete in middle");
        list.delete(2);
        list.display();
        System.out.println("Size of list = " + list.getSize());
//find \\        System.out.println(list.find(3));


    }
}
