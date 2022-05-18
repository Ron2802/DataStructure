package LinkList;

public class LinkList {
    private static Node node;
    private static LinkListData data;
    private static Insert insert;
    private static Delete delete;
    private static MiddleOfLinkList middle;

    public static void main(String[] args) {
        // object creation
        insert = Insert.getInsert();
        data = LinkListData.getLinkListData();
        delete = Delete.getDelete();
        middle = MiddleOfLinkList.getMiddleOfLinkList();

        // insert data begin
        // node = insert.begin(node,50);
        // node = insert.begin(node,60);
        // node = insert.begin(node,70);

        // get middle node value
        middle.getMiddleNode(node);

        // insert data last
        node = insert.last(node, 10);
        middle.getMiddleNode(node);
        node = insert.last(node, 20);
        middle.getMiddleNode(node);
        node = insert.last(node, 30);
        node = insert.last(node, 80);
        middle.getMiddleNode(node);
        // display
        data.display(node);
        // delete begin
        node = delete.begin(node);
        node = delete.end(node);
        // insert position
        node = insert.atPosition(node, 90, 4);
        node = insert.atPosition(node, 100, 10);

        // insert data in sorting order by value
        node = insert.atSortingOrder(node, 5);
        node = insert.atSortingOrder(node, 100);
        node = insert.atSortingOrder(node, 55);
        // display
        data.display(node);
    }
}
