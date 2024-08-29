class Node{
    int data;
    Node next;
    public Node(){
        this.next=null;
    }
    public void add(int data){
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;
        if(this.next==null){
            this.next=newnode;
        }
    }
    public void display(){
        Node temp=this.next;
        while(temp.next!=null){
            System.out.println(this.data);

        }
    }
}
public class PracticeDSLinkedList{
    public static void main(String args[]){
        Node l=new Node();
        l.add(2);
        l.add(1);
        l.display();
        
    }
}