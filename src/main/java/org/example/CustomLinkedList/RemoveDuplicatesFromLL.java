package org.example.CustomLinkedList;

public class RemoveDuplicatesFromLL {
    public static void main(String[] args) {
        Node head=null;
        Node n1=new Node(1);
        Node n2=new Node(1);
        Node n3=new Node(2);
        Node n4=new Node(2);
        Node n5=new Node(3);
        head=n1;
        n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;
        LinkedListCustomInput.recursiveDisplay(head);
        Node node=head;
        while(node.next !=null){

            if(node.data == node.next.data){
                node.next=node.next.next;
            }
            else {
                node=node.next;
            }
        }
        LinkedListCustomInput.recursiveDisplay(head);
    }
}
