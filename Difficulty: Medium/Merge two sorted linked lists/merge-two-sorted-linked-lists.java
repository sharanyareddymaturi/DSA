/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        while(head1!=null){
            arr.add(head1.data);
            head1=head1.next;
        }
        while(head2!=null){
            arr.add(head2.data);
            head2=head2.next;
        }
        Collections.sort(arr);
        Node dummy=new Node(-1);
        Node temp=dummy;
        for(int i=0;i<arr.size();i++){
            temp.next=new Node(arr.get(i));
            temp=temp.next;
        }
        return dummy.next;
    }
}