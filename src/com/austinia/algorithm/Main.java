package com.austinia.algorithm;

public class Main {

	public static void main(String[] args) {
		
		// 라이브러리
		// LinkedList<String> linkedList = new LinkedList<>();
		
		// 단순 연결 리스트
		// SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
		
		// 이중 연결 리스트
		// DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
		
		// 원형 연결 리스트
		// CircularLinkedList<String> circularLinkedList = new CircularLinkedList<>();
		
		// 리버스 연결 리스트
		// ReverseLinkedList<String> reverseLinkedList = new ReverseLinkedList<>();
		
		// 연결 리스트 기반 스택
		// LinkedBasedStack<String> linkedBasedStack = new LinkedBasedStack<>();
		
		// 연결 리스트 기반 큐
		LinkedBasedQueue<String> linkedBasedQueue = new LinkedBasedQueue<>();
		linkedBasedQueue.insert("첫번째");
		linkedBasedQueue.insert("두번째");
		linkedBasedQueue.insert("세번째");
		linkedBasedQueue.pop();
		linkedBasedQueue.pop();
		linkedBasedQueue.pop();
		linkedBasedQueue.pop();
	}

}

