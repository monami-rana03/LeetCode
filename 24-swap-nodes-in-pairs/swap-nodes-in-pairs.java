class Solution {
    public ListNode swapPairs(ListNode head) {

        // Dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Pointer to previous node
        ListNode prev = dummy;

        // Traverse in pairs
        while (prev.next != null && prev.next.next != null) {

            ListNode first = prev.next;
            ListNode second = prev.next.next;

            // Swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev to next pair
            prev = first;
        }

        return dummy.next;
    }
}
