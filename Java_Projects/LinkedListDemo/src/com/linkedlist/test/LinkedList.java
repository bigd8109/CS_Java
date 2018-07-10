package com.linkedlist.test;

public class LinkedList {
	private Node head;
	
	public LinkedList(Node head) {
		this.head = head;
	}
	
	public Node getHead() {
		return this.head;
	}
	//get a specific node
	public Node getNode(int position) {
		int pos = 0;
		Node current = head;
		while (current != null) {
			if (pos == position) {
				return current;
			}
			current = current.getNextNode();
			pos +=1;
		}
		return null;
	}
	
	//add a new node to head
	public void addToHead(Node node) {
		if (head != null) {
			node.setNextNode(head);
			head = node;
		}
	}
	
	//add a new node to tail
	public void addToTail(Node node) {
		Node current = head;
		if (current == null) {
			System.out.println("List is null");
			return;
		}
			
		while (current.getNextNode() != null) {
			current = current.getNextNode();
		}
		current.setNextNode(node);
		node.setNextNode(null);
	}
	
	//add a new node to a specific position (after)
	public void add(Node node, int position) {
		int pos = 0;
		Node current;
		Node nextNode;
		if (position < 0) {
			return;
		}
		current = head;
		while (current != null) {
			if (pos == position) {
				nextNode = current.getNextNode();
				current.setNextNode(node);
				node.setNextNode(nextNode);
			}
			pos++;
			current = current.getNextNode();
		}
	}
	
	//search a Node with a given value
	public int search(int value) {
		Node current = head;
		int pos = 0;
		while (current != null) {
			if (current.getValue() == value) {
				return pos;
			}
			current = current.getNextNode();
			pos +=1;
		}
		return -1;
	}
	
	//search recursively a Node with a given value
	public int searchRecursive(Node head, int value, int pos) {
		if (head == null) {
			return -1;
		}
		if (head != null && head.getValue() == value) {
			return pos;
		}
		else {
			pos +=1;
			return searchRecursive(head.getNextNode(), value, pos);
		}
	}
	
	//remove the node with given value
	public void remove(int value) {
		Node current = head;
		Node prevNode = head;
		Node nextNode;
		while (current != null) {
			if (current.getValue() == value) {
				nextNode = current.getNextNode();
				if (current == head) {
					head = nextNode;
				}
				else {
					prevNode.setNextNode(nextNode);
				}
				current = null;
				return;
			}
			prevNode = current;
			current = current.getNextNode();
		}
	}
	
	//remove the node with given value
	public void removePos(int position) {
		Node current = head;
		Node prevNode = head;
		Node nextNode;
		int pos = 0;
		while (current != null) {
			if (pos == position) {
				nextNode = current.getNextNode();
				if (pos == 0) {
					head = nextNode;
				}
				else{ 
					prevNode.setNextNode(nextNode);
				}
			}
			prevNode = current;
			current = current.getNextNode();
			pos +=1;
		}
	}
	
	//swap two nodes in the list
	public void swapNodes(int node1_value, int node2_value) {
		if (node1_value == node2_value) {
			return;
		}
		//search for node1, maintain prev1
		Node node1 = head;
		Node prev1 = null;
		while (node1 != null && node1.getValue() != node1_value) {
			prev1 = node1;
			node1 = node1.getNextNode();
		}
		
		//search for node2, maintain prev2
		Node node2 = head;
		Node prev2 = null;
		while (node2 != null && node2.getValue() != node2_value) {
			prev2 = node2;
			node2 = node2.getNextNode();
		}
		//quit if two nodes are same
		if (node1 == node2) 
			return;
		
		//if node1 is head, swap it by node2; otherwise link next node
		if (prev1 == null) {
			head = node2;
		}
		else {
			prev1.setNextNode(node2);
		}
		
		//if node2 is head, swap it by node1; otherwise link next node
		if (prev2 == null) {
			head = node1;
		}
		else {
			prev2.setNextNode(node1);
		}
		
		//swap node1 and node2; create tmp as node1's next node
		Node tmp = node1.getNextNode();
		node1.setNextNode(node2.getNextNode());
		node2.setNextNode(tmp);
	}
	
	public void swapNodes2(int x, int y)
    {
        // Nothing to do if x and y are same
        if (x == y) return;
 
        // Search for x (keep track of prevX and CurrX)
        Node prevX = null;
        Node currX = head;
        while (currX != null && currX.getValue() != x)
        {
            prevX = currX;
            currX = currX.getNextNode();
        }
 
        // Search for y (keep track of prevY and currY)
        Node prevY = null, currY = head;
        while (currY != null && currY.getValue() != y)
        {
            prevY = currY;
            currY = currY.getNextNode();
        }
 
        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;
 
        // If x is not head of linked list
        if (prevX != null)
            prevX.setNextNode(currY);
        else //make y the new head
            head = currY;
 
        // If y is not head of linked list
        if (prevY != null)
            prevY.setNextNode(currX);
        else // make x the new head
            head = currX;
 
        // Swap next pointers
        Node temp = currX.getNextNode();
        currX.setNextNode(currY.getNextNode());
        currY.setNextNode(temp);
    }
	
	//return size of the list
	public int size() {
		Node current = head;
		int size = 0;
		while (current != null) {
			current = current.getNextNode();
			size +=1;
		}
		return size;
	}
	
	//print the list
	public void printLinkedList() {
		System.out.print("Head -> ");
		String st = "";
		Node current = head;
		
		while (current != null) {
			st += current.getValue() + " - ";
			current = current.getNextNode();
		}
		System.out.print(st + "NULL\n");
	}
}
