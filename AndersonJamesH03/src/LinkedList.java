
public class LinkedList {
	private Node origin=null;
	private Node end=null;
	private int size=0;
	public LinkedList(){}
	
	//returns the size of the list
	public int getSize(){
		return size;
	}
	
	//adds node to the end of the list
	public void addToEnd(Node node) {
    	if (origin==null){  
    		origin=node;
    		end=node;
    	}else{
    		Node current = origin;
    		while(current.getNext()!=null){
    			current=current.getNext();
    		}
    		current.setNext(node);
    		node.setPrevious(current);
    		end=node;
    	}
    	size++;
    }
	
	//sets the next node of the node behind the current node to be equal 
	//to the next node of the current effectively deleting from the list
	public void deleteNode(Node node){
		if (node!=origin)
			node.getPrevious().setNext(node.getNext());
		else
			origin=node.getNext();
		if (node!=end)
			node.getNext().setPrevious(node.getPrevious());
		else
			end=node.getPrevious();
		size--;
	}
	
	//searches for node based on content and returns the node
	public Node findNode(String content){
		Node current = origin;
		while(current.getNext()!=null){
    		if (current.getContent()==content)
    			return current;
    		else
    			current=current.getNext();
		}
		return null;
	}
		
	//iterates forward through the list and returns a string that is comma 
	//delimited containing the content of each node.
	public String printForward(){
		String list="";
		Node current=origin;
		while(current.getNext()!=null){
			list+=current.getContent()+", ";
    		current=current.getNext();
    	}
		list+=current.getContent();
		return list;
	}
	
	//iterates backwards through the list and returns a string that is comma 
	//delimited containing the content of each node.
	public String printReverse(){
		String list="";
		Node current=end;
		while(current.getPrevious()!=null){
			list+=current.getContent()+", ";
    		current=current.getPrevious();
    	}
		list+=current.getContent();
		return list;
	}
}
