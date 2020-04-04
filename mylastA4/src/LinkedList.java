/*
 * LinkedList class hold and allow for several operations on them . This particular LinkedList will hold Nodes which contain Vector2 values, allowing for some specific methods related to geometry.
 */
public class LinkedList {
	//---Phase 2: Basic Linked List operations---
	
	/*
	 *---variables---
	 */
	private Node top = null;// top variable that sets to null. 
	
	/*
	 * isEmpty method return true if the list is empty and false otherwise.
	 */
	public boolean isEmpty() {
		return (top == null);
	}
	
	/*
	 * getTop method return first Node.
	 */
	public Node getTop() {
		return this.top;
	}
	
	/*
	 * size method return total number of Nodes stored in the list.
	 */
	public int size() {
		Node next = top;
		int total = 0 ; 
		while ( next.getData() != null) {
			next = next.getLink();
			total++;
		 }
		return total;
	}
	
	/*
	 * add method will add the given Vector2 into the LinkedList as the first Node.
	 */
	public void add(Vector2 data) {
		Node prev = new Node (data , top);
		top = prev;
	}
	
	/*
	 * add method will add the given Node to the front of the LinkedList.
	 */
	public void add(Node newNode) {
		top.getLink();
		Node newNode1 = top;
		Node newNode2 = new Node(newNode1.getData(),newNode); // create newNode1  and sets newNode1.getData to it.
		top = newNode2;        
	}
	
	/*
	 *  addLast method  will add a new Node to the LinkedList with the data value given. 
	 */
	void addLast(Vector2 data) {
		Node prev = top ;
		if(prev.getData() != null) {	 //check until last.
			prev = prev.getLink();		 //move .
		}else {
			Node newNode = new Node(data,prev); //create newNode and sets data there .
			prev.setLink(newNode);		//sets data.
		} 
	}
	
	/*
	 *  remove method will remove the first Node in the list and return the value.
	 */
	public Vector2 remove() {
		if (isEmpty()) {
			return null;
		}else {
		   Node newNode1 = top;       
           top = top.getLink(); 
           //return removed object
           return newNode1.getData();
		}
	}
	/*
	 * toString method will return a String that includes ALL the nodes in the list.
	 */
	public String toString(){
		String answer = "[ "; 
		Node prev = top; 
		while(prev != null) { 				//check does it null or not.
			answer += prev.getData() + " "; // collect data.
			prev = prev.getLink();			//move.
		}
		return answer+" ]"; //return answer.
	}
	
	//---Phase 2: Basic Linked List operations END---
}

