package com.austinia.algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class HeapTree {
	
	Integer MAX_SIZE = 10;
	Heap[] queue = new Heap[MAX_SIZE];
	Heap rootHeap = null;
	Integer size = 0;

	public void add(Integer data) {
		Heap tmpHeap = new Heap(data);
		if (size == 0) {
			rootHeap = tmpHeap;
		}
		queue[size] = tmpHeap;
		size++;
	}

	public void print() {
		Arrays.sort(queue, comparator); // 이걸 추가 할때마다 해야하는데 ...
		System.out.println("*********** 계층 순회 ***********");
		for(int i = 0; i < MAX_SIZE; i++) {
			if(queue[i] == null)
				break;
			System.out.println(queue[i].data + "");
		}
	}
	
	Comparator<Heap> comparator = new Comparator<Heap>() {
		@Override
		public int compare(Heap o1, Heap o2) {
			if (o1.data > o2.data) {
				return 1;
			} else if (o1.data == o2.data) {
				return 0;
			} else {
				return -1;
			}
		}
	};
}
