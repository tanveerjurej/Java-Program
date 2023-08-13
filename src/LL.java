

public class LL {
    Node head;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=next;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){

    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");


    }
}
