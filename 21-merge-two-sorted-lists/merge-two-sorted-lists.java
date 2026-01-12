class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node to start the merged list
        ListNode dummy = new ListNode(0);

        // Pointer to build the new list
        ListNode current = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;   // attach list1 node
                list1 = list1.next;     // move list1 pointer
            } else {
                current.next = list2;   // attach list2 node
                list2 = list2.next;     // move list2 pointer
            }

            current = current.next;     // move merged list pointer
        }

        // Attach remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return merged list head
        return dummy.next;
    }
}
