package understanding.java8.programming;

public class Test {
	
	Node head;
	
	class Node {
		int data;
		Node next;
		
		//constructor
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head=new_node;
	}
	
	public void deleteNode(int position) {
		if(head==null){
			return;
		}
		
		Node temp = head;
		if(position==0){
			head=temp.next;
			return;
		}
		
		for(int i=0; temp!=null && i<position -1;i++) {
			temp=temp.next;
		}
		if(temp == null || temp.next ==null){
			return;
		}
		Node next = temp.next.next;
		temp.next = next;
	}
	
	public void printList(){
		Node tnode = head;
		while(tnode!=null){
			System.out.println(tnode.data + " ");
			tnode = tnode.next;
		}
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.push(8);
		test.push(19);
		test.push(71);
		test.push(5);
		
		test.printList();
		
		test.deleteNode(2);
		
		test.printList();
	}
}
