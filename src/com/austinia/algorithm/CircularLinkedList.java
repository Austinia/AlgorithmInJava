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
		tmpNode.nextNode = headNode; // 임시 노드의 다음 노드를 첫 노드로
		tailNode.nextNode = tmpNode; // 현재 노드의 다음 노드를 임시 노드로
		tailNode = tmpNode;
		}
		
	}
	public void print() {
		while(headNode != null) {
			System.out.println(headNode.data);
			headNode = headNode.nextNode;
		}
		
	}
}
