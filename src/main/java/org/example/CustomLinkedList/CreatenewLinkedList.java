package org.example.CustomLinkedList;

public class CreatenewLinkedList {

    public static void main(String[] args) {
        Node head=null;
        Node pointer=null;
        int count=5;

        while(count>0){

            Node node=new Node(count);
            System.out.println( "count="+count);
            if(head == null){
                head=node;
                pointer=head;
            }
            else {

                pointer.next=node;
                pointer=pointer.next;
            }

         --count;



        }
          Node linkedList=head;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
        //FInding Length of the Linked List
        int listSize=0;
        Node temp=linkedList;
        while(null !=temp){
            ++listSize;
            //Printing ith Node
            if(listSize == 3){
                System.out.println(temp.data);
            }

            temp=temp.next;
        }
System.out.println(listSize);
    }
}
