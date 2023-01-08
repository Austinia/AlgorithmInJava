package com.austinia.algorithm;

public class ReverseLinkedList<T> {
	private Node<T> headNode;
	private Node<T> tailNode;
	
	public void insert(T data) {
		Node<T> tmpNode = new Node<>(data);
		if (headNode == null) {
			headNode = tmpNode;
			tailNode = tmpNode;
			return;
		}
		tailNode.nextNode = tmpNode;
		tailNode = tmpNode;
	}
	
	public void print() {
		Node<T> saveHeadNode = headNode;
		while (headNode != null) {
			System.out.println(headNode.data);
			headNode = headNode.nextNode;
		}
		headNode = saveHeadNode;
	}

	public void reverse() {
		Node<T> prevNode = null;
		Node<T> currentNode = headNode;
		while(currentNode != null) {
			Node<T> nextNode = currentNode.nextNode; // 현재 노드의 다음 위치를 저장 (currnetNode가 이동하기 위함)
			currentNode.nextNode = prevNode; // 현재 노드의 다음 위치를 이전 위치를 가리키도록 변경
			// 위치 변
			prevNode = currentNode; // 이전 노드를 현재 노드로 변경
			currentNode = nextNode; // 현재 노드를 다음 노드로 변경
		}
		tailNode = headNode;
		headNode = prevNode;
	}

}
