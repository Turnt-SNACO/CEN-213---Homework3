
public class LinkedList {
	private Node origin=null;
	private Node end=null;
	private int size=0;
	public LinkedList(){}
	
	/**
	 * <b><i>getSize</i></b> - Gets number of nodes in the list/
	 * <p>
	 * @return <b>size</b> - count of nodes in list.
	 */
	public int getSize(){
		return size;
	}
	
	/**
	 * <b><i>addToEnd</i></b> - Adds a node to the end of the list.
	 * <p>
	 * @param node - node to be added
	 * @author james_2pes9af
	 */
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
	
	/**
	 * <b><i>deleteNode</i></b> - Deletes a node from the list.
	 * <p>
	 * Sets the pointers of the node before and after to point at each other leaving no node pointed to the targeted node for deletion.
	 * <p>
	 * @param node - The Node targeted for deletion.
	 * @author james_2pes9af
	 */
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
	
	/** 
	 * <b><i>findNode</i></b> - Searches for node based on content
	 * <p>
	 * Given a string value this method will find if that node exists in the current list.
	 * <p>
	 * @param content - string that is being searched for.
	 * @return <b>Node</b> with content if exists, else <b>null</b>
	 * @author james_2pes9af
	 */
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
	
	/**
	 * <b><i>findNode</i></b> - Searches for node based on ID
	 * <p>
	 * Given an integer value this method will find if that node exists in the current list.
	 * <p>
	 * @param ID - integer assigned to node.
	 * @return <b>Node</b> with ID if exists, else <b>null</b>
	 * @author james_2pes9af
	 */
	public Node findNode(int ID){
		Node current = origin;
		while(current.getNext()!=null){
    		if (current.getID()==ID)
    			return current;
    		else
    			current=current.getNext();
		}
		return null;
	}
	
	/**
	 * <b><i>printForward</i></b> - Prints the contents of the list, going forward.
	 * <p>
	 * Iterates forward through the list and generates a string that is comma delimited containing the content of each node.
	 * <p>
	 * @return <b>String</b> - contains each content in a single string separated by commas.
	 * @author james_2pes9af
	 */
	public String printForward(){
		String list="";
		if (origin!=null){
			Node current=origin;
			while(current.getNext()!=null){
				list+=current.getContent()+", ";
	    		current=current.getNext();
	    	}
			list+=current.getContent();
			return list;
		}
		return "The list is empty.";
	}
	
	/**
	 * <b><i>printReverse</i></b> - Prints the contents of the list, going backwards.
	 * <p>
	 * Iterates backwards through the list and generates a string that is comma delimited containing the content of each node.
	 * <p>
	 * @return <b>String</b> - contains each content in a single string separated by commas.
	 * @author james_2pes9af
	 */
	public String printReverse(){
		String list="";
		if (end!=null){
			Node current=end;
			while(current.getPrevious()!=null){
				list+=current.getContent()+", ";
	    		current=current.getPrevious();
	    	}
			list+=current.getContent();
			return list;
		}
		return "The list is empty";
	}
	
	/**
	 * <b><i>detelteList</i></b> - Deletes the list.
	 * <p>
	 * Iterates through all elements in the list and sets pointers to be null then sets origin and end to null.
	 * <p>
	 * @author james_2pes9af
	 */
	public void deleteList(){
		Node current=origin;
		while(current!=null){
			current.setPrevious(null);
			Node temp = current.getNext();
			current.setNext(null);
			current=temp;
		}
		origin= null;
		end=null;
	}
}
