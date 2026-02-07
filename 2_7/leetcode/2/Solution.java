class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while(l1 != null || l2 != null){
            int first = l1 != null ? l1.val : 0;
            int second = l2 != null ? l2.val : 0;
            int total = first + second + carry;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            if(carry == 1) carry = 0;

            if(total > 9){
                total -= 10;
                carry += 1;
            }

            curr.next = new ListNode(total);
            curr = curr.next;
        }

        if(carry == 1) curr.next = new ListNode(1);

        return dummy.next;
    }
}