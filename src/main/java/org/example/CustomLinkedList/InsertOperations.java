package org.example.CustomLinkedList;

public class InsertOperations {
   static Node head;
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);

        n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;

        //1.Insert at the Beginning

        head=n1;
        Node n6=new Node(60);
        Node temp=head;

        head=n6;
        n6.next=temp;

        LinkedListCustomInput.recursiveDisplay(head);


        //Insert at the End
        Node liend=new Node(70);
        Node headli=head;
        while(headli.next !=null){
           headli=headli.next;
        }
        headli.next=liend;
        LinkedListCustomInput.recursiveDisplay(head);

//Insert Node in the Recursion
    // insertRec(3,120);
    }


}
