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
		// LinkedBasedQueue<String> linkedBasedQueue = new LinkedBasedQueue<>();
		
		// 이진 트리
		BinaryTree<String> binaryTree = new BinaryTree<>();
		binaryTree.insert("첫번째");
		binaryTree.insert("두번째");
		binaryTree.insert("세번째");
		binaryTree.insert("네번째");
		binaryTree.insert("다섯번째");
		binaryTree.insert("여섯번쨰");
		binaryTree.insert("일곱번쨰");
		binaryTree.insert("여덞번쨰");
		binaryTree.print();
	}

}

