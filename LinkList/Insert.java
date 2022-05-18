package LinkList;

public class Insert {

    static Insert insert;

    private Insert() {
    }

    static public Insert getInsert() {
        if (insert == null)
            insert = new Insert();
        return insert;
    }

    public Node last(Node head, int value) {
        if (head == null)
            return begin(head, value);
        else {
            Node temp = head;
            while (temp.getNext() != null)
                temp = temp.getNext();
            temp.setNext(new Node(value));
            return head;
        }
    }

    public Node begin(Node head, int value) {
        if (head == null)
            head = new Node(value);
        else {
            Node temp = new Node(value);
            temp.setNext(head);
            head = temp;
        }
        return head;
    }
}
