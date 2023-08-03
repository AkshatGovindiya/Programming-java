class Node{
	int info;
	Node next;

	Node(int info){
		this.info=info;
		this.next=null;
	}
}

public class QueueImpByList{
	Node front;
	Node rear;

	public void enqueue(int e){
		Node newnode = new Node(e);
		if(front==null){
			front=newnode;
			rear=newnode;
		}
		else{
			rear.next=newnode;
			rear=newnode;
		}
	}

	public void dequeue(){
		if(front==null){
			System.out.println("Queue is empty.");
		}
		else{
			int deletedElement=front.info;
			front=front.next;
				 if (front == null) {
                	 rear = null; 
            	 }
		}
	}
	public void display(){
		Node currNode=front;
		while(currNode!=null){
			System.out.println(currNode.info);
			currNode=currNode.next;
		}
	}
	public static void main(String[] args) {
		QueueImpByList list=new QueueImpByList();
		list.enqueue(5);
		list.enqueue(10);
		list.enqueue(15);
		list.dequeue();
		list.display();
	}
}