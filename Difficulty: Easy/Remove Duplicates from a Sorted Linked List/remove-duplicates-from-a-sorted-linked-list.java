/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node removeDuplicates(Node head) {
        if(head==null){
            return null;
        }
        Node node=head;
        while(head.next!=null){
            if(head.data==head.next.data){
                head.next=head.next.next;
            }else{
                head=head.next;
            }
        }
        return node;
        
    }
}