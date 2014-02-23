/** 
 * @author 		Magdalene Benson <mebenson12@winona.edu>
 * @date		2/13/2014
 * Assignment:	CS 341 :: Stack Assignment :: LinkedList.java
 * 
 */

/**
 * Class: 		LinkedList
 * Contains:	LinkedList() 		// Default Constructor
 * 				addFirst()
 * 				deleteFirst()
 * 				printList()
 * 				size()
 * 				isEmpty()
 * Function:	Creates a new Linked List.
 */
public class LinkedList {
	
	// Instance Variables
	Node head, previous, current;
	int size;
	
	/**
	 * Constructor: LinkedList::LinkedList().
	 * 
	 * Function: 	Creates a new empty Linked List.
	 * 				Sets instance variables.
	 * 
	 * @param 		None
	 */
	public LinkedList() {
		head = null;
	    size = 0;
	} // End Constructor method
	
	/**
	 * Method: 		LinkedList::addFirst().
	 * 
	 * Function: 	Adds the number entered to the first position in the list.
	 * 
	 * @param 		myKey The int to be added to the Linked List.
	 */
	public void addFirst(Integer myIteger) {
	    
		// If the list is empty, insert the first Node as the head
		if (isEmpty()) {
			Node newNode = new Node(myIteger);
			head = newNode;
			size++;
		} else {
	    
	    // Set the current head as next and then place the new Node as the head
	 	Node newNode = new Node(myIteger, head);
	    head = newNode;
	    
	    size++;		// Increase the size of the List
	    
		}
	    
	} // End add() method
	
	/**
	 * Method: 		LinkedList::getFirst().
	 * 
	 * Function: 	Returns the Node at the first position in the list.
	 * 
	 * @param 		myKey The int to be added to the Linked List.
	 */
	public Integer getFirst() 
			throws EmptyListException {
	    	
		// If the list is empty, insert the first Node as the head
		if (isEmpty())
			throw new EmptyListException("The List is empty.");
	    
		return head.getInt();
		
	} // End add() method
	
	/**
	 * Method: 		LinkedList::deleteFirst().
	 * 
	 * Function: 	Removes the number at the first position in the list.
	 * 
	 * @param 		None
	 * @return		removedKey	The key of the Node being removed from the list.
	 * @exception	EmptyListException
	 */
	public Integer deleteFirst()
	    	throws EmptyListException {
		
		// If the list is empty, throw exception
		if (isEmpty())
			throw new EmptyListException("The Stack is empty.");
	    
	    Node temp = head;			// Temp store the head value
	    head = head.getNext();		// Set the new head as head.next
	    size--;						// Decrease the size of the List
	    return temp.getInt();		// Return the key value removed
	    
	} // End add() method
	
	
	/**
	 * Method: 		LinkedList::printList().
	 * 
	 * Function: 	Returns a pretty String representation of the list for the user.
	 * 
	 * @param 		None
	 * @return		result	The String to be printed back to the user.
	 */
	public String printList() {
	    
	    current = head;							// Start at the head,
	    String result = "";
	    
	    while (current != null){				// iterate through each Node
	       result +=  current.getInt() + " ";	// and get the value
	       current = current.getNext();
	    }  
	    return result;							// to print back to the user.

	} // End printList() method
	
	/**
	 * Method:			LinkedList::size()
	 * 
	 * Function:		Returns the size variable of the Linked List.
	 * 
	 * @return			size	The int variable size of the Linked List.
	 */
	public int size() { 
		return size;
	}

	//Checks to see if List is Empty
	private boolean isEmpty() { 
		if (head == null)
	       return true;
	    else
	       return false;
	} // End isEmpty() method
	
} // End LinkedList Class

