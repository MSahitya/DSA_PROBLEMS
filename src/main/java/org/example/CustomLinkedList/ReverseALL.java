package org.example.CustomLinkedList;

public class ReverseALL {
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        Node prev=null;
        Node nextNode=null;
        while(head !=null){

            nextNode=head.next;
            head.next=prev;
            prev=head;
            head=nextNode;
        }
        return prev;
    }
}
