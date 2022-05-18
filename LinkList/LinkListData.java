package LinkList;

public class LinkListData {
    static LinkListData data = null;
    private LinkListData(){}
    static public LinkListData getLinkListData(){
        if(data == null)
            data = new LinkListData();
        return data;
    }
    
    public void display(Node node2) {
        Node temp = node2;
        System.out.println();
        while (temp.getNext() != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNext();
        }
        System.out.print(temp.getValue() + " ");
    }
}
