package Solutions;

import DataStructures.LinkedList.Node;

public class TwoPointThree {
	public static void Solution(Node SomeNode) {
		System.out.println("Removing the node: " + SomeNode.Data);
		
		while (SomeNode.Next != null) {
			SomeNode.Data = SomeNode.Next.Data;
			
			if (SomeNode.Next.Next == null) {
				SomeNode.Next = null;
				
				break;
			}
			
			SomeNode = SomeNode.Next;
		}
	}
}
