package LinkList;

public class MiddleOfLinkList {
    static MiddleOfLinkList middle = null;

    private MiddleOfLinkList() {
    }

    static MiddleOfLinkList getMiddleOfLinkList() {
        if (middle == null)
            middle = new MiddleOfLinkList();
        return middle;
    }

    public void getMiddleNode(Node head) {
        if (head == null)
            System.out.println("");
        else {
            Node fast = head, slow = head;
            while (fast != null && fast.getNext() != null) {
                fast = fast.getNext().getNext();
                slow = slow.getNext();
            }
            System.out.println(slow.getValue());
        }
    }
}
