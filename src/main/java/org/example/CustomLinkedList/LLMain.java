package org.example.CustomLinkedList;

public class LLMain {
    public static void main(String[] args) {
        //Insert Operations: SIngle Linked List
        LL li=new LL();
        li.insertFirst(2);li.insertFirst(3);li.insertFirst(67);
        li.insertEnd(99);li.insertEnd(934);li.insertEnd(65);
        li.display();
        li.insert(45,3);
        li.display();
        System.out.println("item got Deleted ="+li.deleteFirst());
        li.display();

        System.out.println("item got Deleted ="+li.delete(2));
        li.display();


        ////Insert Operations: Double Linked List




    }
}
