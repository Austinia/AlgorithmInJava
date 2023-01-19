package com.austinia.algorithm;

public class Heap {
	Integer data; // 데이터
	Heap nextHeap; // 다음 노드
	Heap prevHeap; // 이전 노드
	Heap parentHeap;
	Heap leftHeap; // 왼쪽 노드
	Heap rightHeap; // 오른쪽 노드
	
	public Heap(Integer data) {
		this.data = data; // 생성자로 데이터를 받는다.
	}
}
