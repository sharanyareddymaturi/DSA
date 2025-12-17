/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node node = new Node(x);
        if(head==null){
            return node;
        }else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
        return head;
    }
}