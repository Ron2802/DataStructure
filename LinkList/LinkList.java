package LinkList;

public class LinkList {
	public static Node node;
	public static void main(String[] args) {
		node = new Node(10);
		node.setNext(new Node(20));
		node.getNext().setNext(new Node(30));
		node.getNext().getNext().setNext(new Node(40));
        node = insertBegin(node,50);
        node = insertBegin(node,60);
        node = insertBegin(node,70);
        node = insertLast(node,80);
        display(node);
        node = deleteBegin(node);
		display(node);
	}
	private static Node deleteBegin(Node node2) {
        if(node2 != null)
            return node2.getNext();
        else return null;
    }
    private static Node insertLast(Node head, int value) {
       if(head == null)
            return insertBegin(head, value);
        else{
            Node temp = head;
            while(temp.getNext() != null)
                temp = temp.getNext();
            temp.setNext(new Node(value));
            return head;
        }
    }
    private static Node insertBegin(Node head,int value) {
        if(head == null)
            head = new Node(value);
        else{
            Node temp  = new Node(value);
            temp.setNext(head);
            head = temp;
        }
        return head;
    }
    private static void display(Node node2) {
		Node temp = node2;
        System.out.println();
		while(temp.getNext() != null) {
			System.out.print(temp.getValue()+" ");
			temp = temp.getNext();
		}
        System.out.print(temp.getValue()+" ");
		
	}
}
