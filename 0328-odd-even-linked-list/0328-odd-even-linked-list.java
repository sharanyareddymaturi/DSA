/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode oddEvenList(ListNode head) {
//         ArrayList<Integer> list1=new ArrayList<>();
//         ArrayList<Integer> list2=new ArrayList<>();
//         ListNode temp=head;
//         int index=1;
//         while(temp!=null){
//             if(index%2!=0){
//                 list1.add(temp.val);
//             }else{
//                 list2.add(temp.val);
//             }
//             temp=temp.next;
//             index++;
//         }
//         ListNode dummy=new ListNode(-1);
//         ListNode curr=dummy;
//         for(int i=0;i<list1.size();i++){
//             curr.next=new ListNode(list1.get(i));
//             curr=curr.next;
//         }
//         for(int i=0;i<list2.size();i++){
//             curr.next=new ListNode(list2.get(i));
//             curr=curr.next;
//         }
//         return dummy.next;
//     }
// }

class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if (head == null)
            return null;

        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;
        int index = 1;
        while (temp != null) {
            if (index % 2 != 0) {
                list.add(temp.val);
            }
            temp = temp.next;
            index++;
        }
        temp = head;
        index = 1;

        while (temp != null) {
            if (index % 2 == 0) {
                list.add(temp.val);
            }
            temp = temp.next;
            index++;
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int val : list) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }
}