
public class Main {
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		Node ace = new Node(0, "ace");
		Node club = new Node(1, "club");
		Node spade = new Node (2, "spade");
		Node diamond = new Node (3, "diamond");
		
		l.addToEnd(ace);
		l.addToEnd(club);
		l.addToEnd(spade);
		l.addToEnd(diamond);
		
		System.out.println(l.printForward());
		System.out.println(l.printReverse());
	}
}
