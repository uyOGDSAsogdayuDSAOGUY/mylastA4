/*
 *Node class stores Vector2 object , Node  as part of LinkedList.It is including some set and get methods  and toString method. 
 */
public class Node {
	//---Phase 1: Node Object---
	
   /*
	*---variables---
	*/
	private Vector2 data;//data stores a single Vector2 object.
    private Node link;	 //next stores the next Node in the LinkedList. 
    
   /*
    *Basic constructor that accepts  Vector2 data value and a Node (the next Node).
    */
    public Node(Vector2  initData, Node initLink){
		this.data = initData;
		this.link = initLink;
	}
    
    /*
     * Set the data.
     */
    public void setData(Vector2 data) {
		this.data = data;
	}
    
    /*
     * Set the link.
     */
	public void setLink(Node next) {
		this.link = next;
	}
	
	/*
	 * Get the data.
	 */
	public Vector2 getData() {
		return data;
	}	
	
	/*
	 * Get the link.
	 */
	public Node getLink() {
		return link;
	}
	
	/*
	 * ToString method that returns  x and y values of the Vector2.
	 */
	public String toString(){
		 return "N" + "(" + data.x + " , "+ data.y +")";
		}
	
	//---Phase 1: Node Object END---	
}
