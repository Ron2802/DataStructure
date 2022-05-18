package LinkList;

public class Delete {
    static Delete delete = null;

    private Delete() {
    }

    static public Delete getDelete() {
        if (delete == null)
            delete = new Delete();
        return delete;
    }

    public Node begin(Node node) {
        if (node != null)
            return node.getNext();
        else
            return null;
    }

    public Node end(Node node) {
        if (node == null || node.getNext() == null)
            return null;
        Node temp = node;
        while (temp.getNext().getNext() != null)
            temp = temp.getNext();
        temp.setNext(null);
        return node;
    }
}
