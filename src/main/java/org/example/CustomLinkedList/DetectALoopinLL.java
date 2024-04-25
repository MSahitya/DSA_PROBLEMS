package org.example.CustomLinkedList;

public class DetectALoopinLL {
    public static boolean detectLoop(Node head){

        if(head == null) return false;

        Node slow_pointer=head;
        Node fast_pointer=head.next;


        while(fast_pointer!= slow_pointer ){
            if(fast_pointer == null || fast_pointer.next==null)
                return false;
            slow_pointer=slow_pointer.next;
            fast_pointer=fast_pointer.next.next;
            if(slow_pointer == fast_pointer){
                return true;
            }
        }




        return false;
    }
}
