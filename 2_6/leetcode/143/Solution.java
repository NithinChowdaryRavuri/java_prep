class Solution {
    public void reorderList(ListNode head) {
        Deque<ListNode> queue = new ArrayDeque<>();

        ListNode curr = head;
        while(curr != null){
            queue.addLast(curr);
            curr = curr.next;
        }

        queue.removeFirst();

        while(queue.size() > 0){
            head.next = queue.removeLast();
            head = head.next;
            if(queue.size() > 0){
                head.next = queue.removeFirst();
                head = head.next;
            }
        }
        
        head.next = null;
    }
}