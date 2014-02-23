/** 
 * @author 		Magdalene Benson <mebenson12@winona.edu>
 * @date		2/13/2014
 * Assignment:	CS 341 :: Stack Assignment :: Stack.java
 * 
 */

/**
 * Class:		Stack.java
 * Contains:	Stack()		// Default Constructor
 * 				push()
 * 				pop()
 * 				peek()
 * 				isEmpty()
 * 				makeEmpty()
 * 				isFull()
 * 				size()
 * 				printStack()
 * Function:	Creates a Stack Object.
 */
public class Stack {
	
	// Absolutes
	final int DEFAULT_CAPACITY = 100;
	
	// Instance Variables
	int size;
	Node top, previous;		// Keep track of locations in the Stack.
	LinkedList myStackList;
	
	/**
	 * Constructor:		Stack::Stack()
	 * 
	 * Function:		Creates a new Stack object and instantiates
	 * 					the instance variables.
	 * 
	 * @param			None
	 */
	public Stack() {
		myStackList = new LinkedList();
		size = 0;
		top = null;
		previous = null;
	} // End Stack() Constructor
	
	/**
	 * Method:			Stack::push()
	 * 
	 * Function:		Adds an Integer object to the data Stack.
	 * 
	 * @param			myInteger	The Integer being pushed/added to the Stack.
	 * @exception		FullStackException
	 */
	public Integer push(Integer myInteger)
					throws FullStackException {
		
		if (isFull())
			throw new FullStackException("The Stack is full.");
		else {
			myStackList.addFirst(myInteger);
			size++;
			return myInteger;
		}
	} // End push() method
	
	/**
	 * Method:			Stack::pop()
	 * 
	 * Function:		Removes the Integer on the top of the Stack.
	 * 
	 * @param			None
	 * @return			Returns the Integer being removed from the Stack.
	 */
	public Integer pop() {
		if (isEmpty())		// Check to see if the Stack is already empty.
			return null;	// and return null if true
		else {
			size--;
			return myStackList.deleteFirst();
		}
	} // End pop() method
	
	/**
	 * Method:			Stack::peek()
	 * 
	 * Function:		Returns the Integer at the top of the Stack
	 * 					without removing it.
	 * 
	 * @param			None
	 * @return			Returns the Integer at the top of the Stack.
	 */
	public Integer peek() {
		
		if (isEmpty())
			throw new EmptyListException("The Stack is empty.");
		
		return myStackList.getFirst();
	} // End peek() method
	
	/**
	 * Method:			Stack::isEmpty()
	 * 
	 * Function:		Checks to see if the Stack is empty, and returns the result.
	 * 
	 * @param			None
	 * @return			True if the Stack is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return (size == 0);
	}
	
	/**
	 * Method:			Stack::makeEmpty()
	 * 
	 * Function:		Removes all Integers from the Stack making it empty.
	 * 
	 * @param			None
	 */
	public void makeEmpty() {
		size = 0;
	}
	
	/**
	 * Method:			Stack::isFull()
	 * 
	 * Function:		Checks to see if the Stack is full, and returns the result.
	 * 
	 * @param			None
	 * @return			True if the Stack is full, false otherwise.
	 */
	public boolean isFull() {
		return (size == DEFAULT_CAPACITY);
	}
	
	/**
	 * Method:			Stack::size()
	 * 
	 * Function:		Returns the current size of the Stack.
	 * 
	 * @param			None
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Method:			Stack::printStack()
	 * 
	 * Function:		Prints a pretty String back to the user the contents of the Stack.
	 * 
	 * @param			None
	 * @returns			A String concatenation of the Stack contents.
	 */
	public String printStack() {
		
		return myStackList.printList();
	}

} // End Stack Class
