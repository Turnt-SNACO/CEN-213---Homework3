
public class Main {
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		Node ace = new Node(0, "ace");
		Node club = new Node(1, "club");
		Node spade = new Node (2, "spade");
		Node diamond = new Node (3, "diamond");
		
		//test insert alphabetically
		l.insertAlphabetically(club);
		l.insertAlphabetically(ace);
		l.insertAlphabetically(spade);
		l.insertAlphabetically(diamond);
		
		//test prints
		System.out.println(l.printForward());
		System.out.println(l.printReverse());
		System.out.println(l.getSize());
		
		//test finds
		System.out.println("Found ace at ID: "+l.findNode("ace").getID());
		System.out.println("Found ID 0 with content: "+l.findNode(0).getContent());
		
		//test deletes
		l.deleteNode(club);
		
		//post delete print check
		System.out.println(l.printForward());
		System.out.println(l.printReverse());
		System.out.println(l.getSize());
		
		l.deleteList();
		System.out.println(l.printForward());
		System.out.println(l.printReverse());
		
		l.addToEnd(ace);
		System.out.println(l.printForward());
		
		
	}
}
