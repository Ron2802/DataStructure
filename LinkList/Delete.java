package LinkList;

public class Delete {
    static Delete delete = null;
    private Delete(){}
    static public Delete getDelete(){
        if(delete == null)
            delete = new Delete();
        return delete;
    }
    public Node begin(Node node2) {
        if(node2 != null)
            return node2.getNext();
        else return null;
    } 
}
