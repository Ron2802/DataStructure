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

    public Node atPosition(Node head, int value, int pos) {
        Node temp = new Node(value);
        if (pos == 1) {
            temp.setNext(head);
            return temp;
        }
        Node current = head;
        for (int i = 1; i < pos - 2 && current != null; i++)
            current = current.getNext();
        if (current == null)
            return head;
        temp.setNext(current.getNext());
        current.setNext(temp);
        return head;
    }

    public Node atSortingOrder(Node head, int value) {
        Node temp = new Node(value);
        if (temp.getValue() < head.getValue()) {
            temp.setNext(head);
            return temp;
        }
        Node currentNode = head;
        while(currentNode.getNext() != null){
            if(value < currentNode.getNext().getValue())
                break;
            currentNode = currentNode.getNext();
        }
        temp.setNext(currentNode.getNext());
        currentNode.setNext(temp);
        return head;
    }
}
