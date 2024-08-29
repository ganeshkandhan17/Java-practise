// import java.util.Scanner;
class SMain{
    static Node head = null;
    static class Node{
        int data;
        Node next;
    }
    static void add(int d){
        Node newNode = new Node();
        newNode.data = d;
        newNode.next = null;
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null)
            temp = temp.next;
            temp.next = newNode;
        }


    }

    static void delbeg(){
        if(head.next == null){
            head = null;
        }
        else{
            Node temp = head.next;
            head = null;
            head = temp;
        }
    }
    static void  dellast(){
        if(head.next == null){
            head = null;
        }
        else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;

            }
            temp.next = null;
        }
    }

    static void delspec(int x){
        Node temp =head;
        while(temp.next.data != x){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    static void insaf(int x, int d){
        Node newNode = new Node();
        newNode.data = d;
        newNode.next = null;
        Node temp = head;
        while(temp.data != x)
        temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;
    }
    static void insbeg(int d){
        Node newNode = new Node();
        newNode.data = d;
        newNode.next = null;
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        
    }


    public static void main(String[] args){
        add(12);
        add(42);
        insaf(12,25);
        insbeg(100);
        System.out.println();
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        delbeg();
        System.out.println();
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        dellast();
        System.out.println();
        System.out.println(head.data);
        System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
        add(50);
        add(60);
        System.out.println();
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        

        delspec(50);
        System.out.println();
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        
    }

}