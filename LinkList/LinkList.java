package LinkList;

public class LinkList {
	private static Node node;
    private static LinkListData data;
    private static Insert insert;
    private static Delete  delete;
	public static void main(String[] args) {
		//object creation
        node = new Node(10);
        insert = Insert.getInsert();
        data = LinkListData.getLinkListData();
        delete = Delete.getDelete();
        //insert the data 
		node.setNext(new Node(20));
		node.getNext().setNext(new Node(30));
		node.getNext().getNext().setNext(new Node(40));
        //insert data begin
        node = insert.begin(node,50);
        node = insert.begin(node,60);
        node = insert.begin(node,70);
        //insert data last
        node = insert.last(node,80);
        //display
        data.display(node);
        //delete begin
        node = delete.begin(node);
        //display
		data.display(node);
	}
	
}
