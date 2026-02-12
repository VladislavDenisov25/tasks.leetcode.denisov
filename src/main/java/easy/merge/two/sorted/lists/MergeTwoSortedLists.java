package easy.merge.two.sorted.lists;

public class MergeTwoSortedLists {

    ListNode result = new ListNode();
    ListNode current = result;

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                addListNode(list1);
                list1 = list1.next;
            } else {
                addListNode(list2);
                list2 = list2.next;
            }
        }
        while (list1 == null && list2 != null) {
            addListNode(list2);
            list2 = list2.next;

        }
        while (list2 == null && list1 != null) {
            addListNode(list1);
            list1 = list1.next;
        }
        return result.next;
    }

    public void addListNode(ListNode listNode) {
        current.next = listNode;
        current = current.next;
    }
}
