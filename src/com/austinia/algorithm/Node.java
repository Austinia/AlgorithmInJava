package com.austinia.algorithm;

class Node<T> {
	T data; // 데이터
	Node<T> nextNode; // 다음 노드
	Node<T> prevNode; // 이전 노드
	
	public Node(T data) {
		this.data = data; // 생성자로 데이터를 받는다.
	}
}