package easy.task141;


public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next.next == null || head.next == null) return false;

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && slow.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;
        }
        return false;
    }
}
