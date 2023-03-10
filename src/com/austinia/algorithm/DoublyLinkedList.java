package com.austinia.algorithm;

public class DoublyLinkedList<T> {
	
	Node<T> headNode;
	Node<T> tailNode;

	public void insert(T data) {
		Node<T> tmpNode = new Node<>(data); // 임시 노드를 만든다.
		if(headNode == null) {
			headNode = tmpNode; // 임시 노드가 헤드노드가 된다.
			tailNode = tmpNode; // 임시 노드가 테일노드가 된다.
			return;
		}
		tmpNode.prevNode = tailNode; // 임시 노드의 이전 포인터로 현재 노드 설정.
		tailNode.nextNode = tmpNode; // 임시 노드를 현재 노드의 다음 포인터로 변경.
		tailNode = tmpNode; // 임시 노드를 현재 노드로 변경
		
	}

	public void print() {
		while (headNode != null) {
			System.out.println("헤드에서부터 : " + headNode.data);
			headNode = headNode.nextNode;
		}
		while (tailNode != null) {
			System.out.println("테일에서부터 : " + tailNode.data);
			tailNode = tailNode.prevNode;
		}
	}

}
