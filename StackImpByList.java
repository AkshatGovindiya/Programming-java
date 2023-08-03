
class Node{
    int info;
    Node next;

    Node(int info){
        this.info=info;
        this.next=null;
    }
}

public class StackImpByList{
    Node top;

    public void push(int e){
        Node newnode=new Node(e);
           newnode.next=top;
           top=newnode;
         }
    
    public void pop(){
        if(top==null){
            System.out.println("Stack is empty.");
        }
        int deletedElement=top.info;
        top=top.next;
    }

    public void display() {
        if (top == null) {
            System.out.println("List is empty.");
        } 
        else {
            Node current = top;
            while (current != null) {
                System.out.println(" Number: " + current.info);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        StackImpByList list=new StackImpByList();
        list.push(5);
        list.push(10);
        list.push(15);
        list.pop();
        list.push(20);
        list.display();

    }
}



