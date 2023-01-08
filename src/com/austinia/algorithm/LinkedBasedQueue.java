package com.austinia.algorithm;

public class LinkedBasedQueue<T> {
	
	Node<T> headNode;
	Node<T> tailNode;

	public void insert(T data) {
		Node<T> tmpNode = new Node<>(data); // 임시 노드를 만든다.
		if(headNode == null) {
			headNode = tmpNode; // 임시 노드가 헤드노드가 된다.
			tailNode = tmpNode; // 임시 노드가 테일노드가 된다.
			return;
		}
		
		tailNode.nextNode = tmpNode; // 임시 노드를 현재 노드의 다음 포인터로 변경.
		tailNode = tmpNode; // 임시 노드를 현재 노드로 변경
		
	}
	
	public void pop() {
		if(headNode != null) {
			System.out.println(headNode.data);
			headNode = headNode.nextNode;
		} else {
			System.out.println("NONE!");
		}
	}
}
