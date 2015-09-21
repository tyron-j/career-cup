package CareerCup;

import DataStructures.LinkedList;

import Solutions.TwoPointThree;

public class CareerCup {
	public static void main(String[] args) {
		// set up
		LinkedList MyLinkedList = new LinkedList(1);
		
		MyLinkedList.Add(2);
		MyLinkedList.Add(3);
		MyLinkedList.Add(4);
		MyLinkedList.Add(5);
		MyLinkedList.Add(6);
		MyLinkedList.Add(7);
		
		MyLinkedList.Iterate();
		
		// solution
		TwoPointThree.Solution(MyLinkedList.FirstNode.Next.Next); // pass in 3
		
		MyLinkedList.Iterate();
	}
}