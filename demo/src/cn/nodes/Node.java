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
	
	//��ȡ��һ���ڵ�
	public Node next() {
		return this.next();	
	}
	
	public int getData() {
		return this.data;
		
	}
}
