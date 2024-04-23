package org.example.CustomLinkedList;

public class CustomDoubleLL {
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        n1.prev=null;
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        n3.next=n4;
        n4.prev=n3;
        n4.next=n5;
        n5.prev=n4;

        //System.out.println(n4.prev.data);
        //Inserting node at the begning
        Node n6=new Node(60);
        Node head=n1;
        Node temp=head;
        head=n6;
        n6.next=temp;
        temp.prev=n6;

       // System.out.println(n1.prev.data);
       Node prev=null,nextNode=null;
       Node printHead=head;
       System.out.println("REverse before");
        LinkedListCustomInput.recursiveDisplay(printHead);
             while(head !=null){

                   nextNode=head.next;
                   head.next=prev;
                   prev=head;
                   head=nextNode;

             }
        System.out.println("After Reverse");
           LinkedListCustomInput.recursiveDisplay(prev);



    }
}
