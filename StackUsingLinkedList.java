class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Stack{
    private Node top;
    public Stack(){
        this.top=null;
    }

    public void push(int value){
        Node newnode=new Node(value);
        newnode.next=top;
        top=newnode;
        System.out.println(value+" pushed to stack");
    }

    public int pop(){
        if(isEmpty()){
            System.out.println(" Stack is empty");
            return -1;
        }
        int poppedvalue=top.data;
        top=top.next;
        System.out.print(poppedvalue+" is popped from stack");
        return poppedvalue;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println(" Stack is empty");
            return -1;
        }
        return top.data;
    }

    public Boolean isEmpty(){
        return top==null;
    }
    
}
public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();
        stack.pop();

    }
}
