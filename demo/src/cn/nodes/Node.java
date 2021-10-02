package cn.nodes;

public class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
	
	public void append (Node node) {
		this.next = node;
	}
	
	//收取下一个节点
	public Node next() {
		return this.next();	
	}
	
	public int getData() {
		return this.data;
		
	}
}
