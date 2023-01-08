package com.austinia.algorithm;

public class LinkedBasedStack<T> {
	
	Node<T> headNode;
	Node<T> tailNode;
	
	public void insert(T data) {
		Node<T> tmpNode = new Node<>(data);
		if(headNode == null) {
			headNode = tmpNode;
			tailNode = tmpNode;
			return;
		}
		tmpNode.prevNode = tailNode; // 임시 노드의 이전 포인터로 현재 노드 설정.
		tailNode = tmpNode; // 임시 노드를 현재 노드로 변경
		
	}
	
	public void pop() {
		if(tailNode != null) {
			System.out.println(tailNode.data);
			tailNode = tailNode.prevNode;
		} else {
			System.out.println("NONE!");
		}
	}
	
}
