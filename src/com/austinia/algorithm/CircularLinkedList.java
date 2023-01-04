package com.austinia.algorithm;

public class CircularLinkedList<T> {
	Node<T> headNode;
	Node<T> tailNode;
	
	public void insert(T data) {
		Node<T> tmpNode = new Node<>(data);
		if(headNode == null) {
			headNode = tmpNode;
			tailNode = tmpNode;
		} else {
		tmpNode.nextNode = headNode;
		tailNode.nextNode = tmpNode;
		headNode = tmpNode;
		}
		
	}
	public void print() {
		while(headNode != null) {
			System.out.println(headNode.data);
			headNode = headNode.nextNode;
		}
		
	}
}
