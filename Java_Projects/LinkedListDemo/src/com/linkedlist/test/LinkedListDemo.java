package com.linkedlist.test;

public class LinkedListDemo {
	public static void main(String[] args) {
		System.out.println("LinkedListDemo");
	
		LinkedList list = new LinkedList(new Node(5));
		list.addToTail(new Node(3));
		list.addToHead(new Node(4));
		list.addToTail(new Node(10));
		list.add(new Node(8), 3);
		list.printLinkedList();
		
		System.out .println("Search for value 4: " + list.search(4));
		System.out .println("Search for value 8: " + list.searchRecursive(list.getHead(), 10, 0));
		System.out .println("Search for value 15: " + list.search(15));
		System.out .println("List size: " + list.size());
		
		list.removePos(5);
		list.printLinkedList();
		list.swapNodes(8, 10);
		list.printLinkedList();
	}
}
