package org.example.CustomLinkedList;

public class Merge2SortedLL {
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;//sorted List1

        Node n11=new Node(10);
        Node n21=new Node(20);
        Node n31=new Node(35);
        Node n41=new Node(45);
        Node n51=new Node(55);

        n11.next=n21;n21.next=n31;n31.next=n41;n41.next=n51;//Sorted List2
        Node head1=n1;
        Node head2=n11;


        Node temp=head1;

        while(head1.next !=null && head2.next !=null ){
            if(head1.data  < head2.data && head1.data > head2.data){
                Node node=head1;
                head1.next=head2;
                head2=head2.next;

             }
               else{

                }

        }







    }
}
