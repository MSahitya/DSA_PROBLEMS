package org.example.CustomLinkedList;

public class YShapedLinkedList {
    //Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2)
    {
        int size_head1=0,size_head2=0;
        Node temp;
        for(temp=head1;temp !=null;temp=temp.next){
            size_head1++;
        }
        for(temp=head2;temp !=null;temp=temp.next){
            size_head2++;
        }
        //ifList1 is longer
        while(size_head1 > size_head2){
            head1=head1.next;
            size_head1--;

        }

        while(size_head2 > size_head1){
            head2=head2.next;
            size_head2--;

        }
        while(head1 != head2){

            head1=head1.next;
            head2=head2.next;
        }
        if(head1!=null){
            return head1.data;
        }
        else
            return -1;


    }
}
