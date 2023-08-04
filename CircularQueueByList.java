class Node{
	int info;
	Node next;

		Node(int info){
			this.info=info;
			this.next=null;
		}
}

public class CircularQueueByList{
	Node front;
	Node rear;

	public void enqueue(int e){
		Node newnode=new Node(e);

		if(front==null){
			front=newnode;
			rear=newnode;
		}
		else{
			rear.next=newnode;
			rear=newnode;
		}
		rear.next=front;
	}

	public void dequeue(){
		if (front == null) {
            System.out.println("Queue is empty.");
        }
		
		int deletedElement=front.info;
		if(front==rear){
			front=null;
			rear=null;	
		}		
		else{
			front=front.next;
			rear.next=front;
		}
	}

	public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Node currNode = front;
        while (currNode != rear) {
            System.out.println(currNode.info);
            currNode = currNode.next;
        } 
    }

	public static void main(String[] args) {
		CircularQueueByList list=new CircularQueueByList();
		list.enqueue(5);
		list.enqueue(10);
		list.enqueue(15);
		list.display();	
	}
}