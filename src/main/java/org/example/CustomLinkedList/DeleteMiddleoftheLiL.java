package org.example.CustomLinkedList;

public class DeleteMiddleoftheLiL {
    Node deleteMid(Node head) {
        Node slow=head;
        Node fast=head;
        if(head == null || head.next ==null)
            return null;//One Node
        if(head.next.next==null){//2 Nodes
            head.next=null;
            return head;
        }

        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.data=slow.next.data;
        slow.next=slow.next.next;
        return head;



    }
}
