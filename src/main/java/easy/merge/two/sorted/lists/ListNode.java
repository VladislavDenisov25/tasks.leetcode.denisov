package easy.merge.two.sorted.lists;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode listNode = this;
        while (listNode != null){
            stringBuilder.append(listNode.val).append(" ");
            listNode = listNode.next;
        }
        return stringBuilder.toString();
    }
}
