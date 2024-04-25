package org.example.CustomLinkedList;

public class DeleteWithoutHead {
    void deleteNode(Node del_node)
    {
        del_node.data=del_node.next.data;
        del_node.next=del_node.next.next;


        // Your code here
    }
}
