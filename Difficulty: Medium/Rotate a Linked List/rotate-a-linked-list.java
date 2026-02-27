/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        int count=1;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        k=k%count;
        if(k==0){
            return head;
        }
        temp.next=head;
        
        Node kth=head;
        for(int i=1;i<k;i++){
            kth=kth.next;
        }
        Node newhead=kth.next;
        kth.next=null;
        return newhead;
    }
}