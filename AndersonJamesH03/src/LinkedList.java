
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
	
	//iterates forward through the list and returns a string that is comma delimited containing the content of each node.
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
	
	//iterates backwards through the list and returns a string that is comma delimited containing the content of each node.
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
