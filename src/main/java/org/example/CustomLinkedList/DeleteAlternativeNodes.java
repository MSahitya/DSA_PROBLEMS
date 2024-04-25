package org.example.CustomLinkedList;

public class DeleteAlternativeNodes {
    public void deleteAlternate (Node head){
        Node nextNode=null;

        while(head != null){

            if(head.next !=null){
                nextNode =head.next.next;
                head.next=nextNode;

            }
            head=head.next;
        }
        //Write your code here
    }
}
