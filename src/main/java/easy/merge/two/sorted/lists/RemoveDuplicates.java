package easy.merge.two.sorted.lists;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode noDublicates = new ListNode(head.val);
        ListNode current = noDublicates;

        while (head.next != null){
            ListNode next = head.next;
            if (current.val != next.val){
                current.next = new ListNode(next.val);
                current = current.next;
            }
            head = next;
        }


        return noDublicates;
    }
}


