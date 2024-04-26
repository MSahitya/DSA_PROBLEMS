package org.example.CustomLinkedList;

public class CycleDetection {
    public static void main(String[] args) {
        LL li1=new LL();
        li1.insertEnd(2);li1.insertEnd(3);li1.insertEnd(5);
        li1.insertEnd(8);li1.insertEnd(9);li1.insertEnd(10);li1.insertEnd(15);
        li1.insertEnd(25);li1.insertEnd(5);
        li1.display();
    }
}
