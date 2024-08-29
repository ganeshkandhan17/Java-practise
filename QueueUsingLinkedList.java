class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Queue{
    public Node front;
    public Node rear;
    public Queue(){
        this.front=null;
        this.rear=null;
    }

    public void enqueue(int value){
        Node newnode=new Node(value);
        if(isEmpty()){
            front=newnode;
            rear=newnode;
        }
        else{
            rear.next=newnode;
            rear=newnode;
        }
        System.out.println(value+" pushed to stack");
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println(" Stack is empty");
            return -1;
        }
        int poppedvalue=rear.data;
        rear=rear.next;
        System.out.println(poppedvalue+" is popped from stack");
        return poppedvalue;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println(" Stack is empty");
            return -1;
        }
        return front.data;
    }

    public Boolean isEmpty(){
        return front==null;
    }
    
}
public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        q.dequeue();

    }
}
