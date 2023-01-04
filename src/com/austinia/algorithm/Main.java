package com.austinia.algorithm;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		// 라이브러리
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("라이브러리 첫번째");
		linkedList.add("라이브러리 두번째");
		linkedList.add("라이브러리 세번째");
		System.out.println(linkedList.toString());
		
		// 단순 연결 리스트
		SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
		singlyLinkedList.insert("첫번째");
		singlyLinkedList.insert("두번째");
		singlyLinkedList.insert("세번째");
		singlyLinkedList.print();
		
		// 이중 연결 리스트
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
		doublyLinkedList.insert("첫번째");
		doublyLinkedList.insert("두번째");
		doublyLinkedList.insert("세번째");
		doublyLinkedList.print();
		
		//원형 연결 리스트
		CircularLinkedList<String> circularLinkedList = new CircularLinkedList<>();
		circularLinkedList.insert("첫번째");
		circularLinkedList.insert("두번째");
		circularLinkedList.insert("세번째");
		circularLinkedList.print();
		
	}

}

