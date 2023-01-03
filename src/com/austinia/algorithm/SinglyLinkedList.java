package com.austinia.algorithm;

public class SinglyLinkedList<T> {
	private Node<T> headNode; // 헤드 노드를 정의.
	
	public void insert(T data) {
		Node<T> tmpNode = new Node<>(data); // 임시 노드를 만든다.
		if (headNode == null) { // 처음이면 = 헤드노드가 없으면
			headNode = tmpNode; // 임시 노드가 헤드노드가 된다.
			return;
		}
		tmpNode.nextNode = headNode; // 헤드를 임스 노드의 다음 포인터로 변경.
		headNode = tmpNode; // 임시 노드를 헤드로 변경
	}
	
	public void print() {
		while (headNode != null) { // 헤드가 없어질 때까지 = 끝까지
			System.out.println(headNode.data); // 헤드를 출력하고
			headNode = headNode.nextNode; // 다음 헤드로 연결
		}
	}
}