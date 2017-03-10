
public class Node {
	
	private Node previous,next;
	private int ID;
	private Comparable content;
	
	//Construct the node with an ID and content
	public Node(int ID, Comparable content){
		this.ID=ID;		this.content=content;
		this.next=null; this.previous=null;
	}
	
	//returns the previous node
	public Node getPrevious() {
		return previous;
	}
	
	//set the previous node
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
	//returns the next node
	public Node getNext() {
		return next;
	}
	
	//sets next node
	public void setNext(Node next) {
		this.next = next;
	}
	public Comparable getContent() {
		return content;
	}
	public void setContent(Comparable content) {
		this.content = content;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
}
