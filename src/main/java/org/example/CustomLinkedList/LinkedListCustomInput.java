package org.example.CustomLinkedList;

import java.util.Scanner;

public class LinkedListCustomInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node head=null,tail=null;
        while(data !=-1){

            Node node=new Node(data);
            if(head == null){
                head=node;
                tail=node;
            }
            else{
                tail.next=node;
                tail=tail.next;

            }
            data=sc.nextInt();
        }


        Node temp=head;
        Node printNode=head;
        while(null !=temp){
       System.out.println(temp.data);
        temp=temp.next;
        }
        recursiveDisplay(printNode);
       // reverseLLsingle(printNode);
    }

    //Recursive display of Linked List
    public static void recursiveDisplay(Node head){
        if(head == null)
        return;
        System.out.println(head.data);
          recursiveDisplay(head.next);
    }

    //Reverse the Single Linked List

}
