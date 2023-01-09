package com.austinia.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

	Node<T> rootNode = null;
	Integer size = 0;

	public void insert(T data) {
		Node<T> tmpNode = new Node<T>(data);
		if (size == 0) {
			rootNode = tmpNode; // 사이즈가 0이면 루트노드 설정
			size++;
			return;
		}
		Queue<Node<T>> queue = new LinkedList<>();
		queue.add(rootNode);
		
		while(!queue.isEmpty()) {
			Node<T> currentNode = queue.peek(); // 큐 맨 처음 노드를 꺼낸다
			if(currentNode.leftNode == null) { // 왼쪽 자식이 없으면
				currentNode.leftNode = tmpNode; // 왼쪽에 노드를 넣는다.
				tmpNode.parentNode = currentNode;
				size++;
				break;
			} else {
				queue.add(currentNode.leftNode); // 왼쪽 노드가 있으면 큐에 넣는다
			}
			
			if (currentNode.rightNode == null) {
				currentNode.rightNode = tmpNode;
				tmpNode.parentNode = currentNode;
				size++;
				break;
			} else {
				queue.add(currentNode.rightNode);
			}
			queue.poll(); // 큐 맨 앞을 뺀다
		}
	}

	public void print() {
		System.out.println("트리 사이즈 : " + size);
		System.out.println("-- 전위순회 --");
		preOrder(rootNode);
		System.out.println("-- 중위순회 --");
		inOrder(rootNode);
		System.out.println("-- 후위순회 --");
		postOrder(rootNode);
		System.out.println("-- 층위순회 --");
		levelOrder(rootNode);
	}

	private void preOrder(Node<T> node) {
		if (node != null) {
			System.out.println(node.data);
			preOrder(node.leftNode);
			preOrder(node.rightNode);
		}
	}

	private void inOrder(Node<T> node) {
		if (node != null) {
			inOrder(node.leftNode);
			System.out.println(node.data);
			inOrder(node.rightNode);
		}
	}

	private void postOrder(Node<T> node) {
		if (node != null) {
			postOrder(node.leftNode);
			postOrder(node.rightNode);
			System.out.println(node.data);
		}
	}

	private void levelOrder(Node<T> node) {
		Queue<Node<T>> queue = new LinkedList<>(); // 큐 생성
		queue.add(node); // 큐에 노드 넣기

		while (!queue.isEmpty()) {
			Node<T> currentNode = queue.peek(); // 큐의 첫번째 값
			System.out.print(currentNode.data + "\n"); // 을 보여주고
			if (currentNode.leftNode != null) { // 왼쪽 노드가 있으면 넣고
				queue.add(currentNode.leftNode);
			}
			if (currentNode.rightNode != null) { // 오른쪽 노드가 있으면 넣는다
				queue.add(currentNode.rightNode);
			}
			queue.poll(); // 그리고 해당 노드 삭제
		}
	}
}
