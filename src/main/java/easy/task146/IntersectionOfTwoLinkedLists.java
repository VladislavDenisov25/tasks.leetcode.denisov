package easy.task146;

import easy.task141.ListNode;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode copyA = headA;
        ListNode copyB = headB;
        while (copyA.next != null && copyB.next != null){
            if (copyA.next == copyB.next) {
                return copyA.next;
            }
            copyA = copyA.next;
            copyB = copyB.next;
        }
        return null;
    }
}
