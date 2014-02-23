/** 
 * @author 		Magdalene Benson <mebenson12@winona.edu>
 */
import java.util.Random;

public class StackClient {	
	
	public static void main(String[] args) throws FullStackException {
		
		// Absolutes
		final int CAPACITY = 1000;
		
		// Instance variables
		Random rand = new Random();
		int pushNum, popNum;
		int pushCount = 0;
		int popCount = 0;
		int indexCount = 0;
		boolean pushed = true;
		boolean popped = true;
		
		// Used for comparison in the pop method after pushes
		Integer[] pushedArray = new Integer[100]; 
		
		System.out.println("1. Constructing the Stack.");
		Stack myStack = new Stack();
		
		// Constructing an array to contain Integer objects
		Integer[] myArray = new Integer[CAPACITY];
		
		System.out.println("2. Constructing an array of " + CAPACITY + " unique Integer objects.");
		for (int i = 0; i < CAPACITY; i++) {
			myArray[i] = new Integer(i);
		}
		
		// Loop through the push/pop sequence 20+ times.
		for (int loop = 1; loop <= 25; loop++) {
		
			// A friendly printout to the user to know where the user is
			// in the test case looking through the completed test run.
			System.out.println("\nLoop iteration number: " + loop);
			
			
			
			pushNum = rand.nextInt(10)+1;
			// This is where I am pushing a set (of between 1-10 numbers) into the Stack.
			System.out.println("\n3. Pushing a random set of Integer objects into the Stack.");
			for (int push = 0; push < pushNum; push++) {		// Push between 1 and 10 Integers into the Stack.
					
				// First make sure the Stack is not already full.
				if (!myStack.isFull()) {
					
					// Store the Integers being pushed into an array for later comparison.
					pushedArray[pushCount-popCount] = myArray[indexCount];
					
					// Push the Integer to the Stack and print the Integer pushed back to the user.
					System.out.print(myStack.push(myArray[indexCount]) + " ");
						
					indexCount++;
					pushCount++;
					pushed = true;
						
				// Print out a friendly exception to the user and reset the Stack if it is already full.
				} else {
					System.err.println("Caught FullStackException: The Stack is full. Restarting the Stack.\n");
					// Reset the Stack and the counter variables.
					myStack.makeEmpty();
					pushCount = 0;
					popCount = 0;
					pushed = false;
				}
			}
			// Print this once the pushes have been completed.
			if (pushed == true)
			System.out.print("has been pushed to the Stack.\n");
			System.out.println("There are currently " + (pushCount-popCount) + " Integers in the Stack.");
			
		
			// Store the current size of the stack by using the push and pop counts
			int stackSize = pushCount-popCount;
			popNum = rand.nextInt(stackSize)+1;
			
			System.out.println("\n4. Popping a random number of Integer objects from the Stack.");
			if (!myStack.isEmpty() && stackSize > 0) {
				for (int pop = 0; pop < popNum; pop++) {
					
					// First peek at the Stack and verify that the number about
					// to be popped was indeed pushed last to the Stack.
					Integer peeked = myStack.peek();
					
					// Compare the first element in the Stack with the last number pushed to the Stack.
					if (peeked == pushedArray[(pushCount-1)-popCount]) {
						System.out.print(myStack.pop() + " ");	// Pop if they are equal.
						popCount++;
						popped = true;
					} else {									// Print error if not equal.
						System.err.println(peeked + " != " + pushedArray[(pushCount-1)-popCount]);
						popped = false;
					}
				}
				// Print this once the pops have been completed.
				if (popped == true)
					System.out.print("has been popped from the Stack.");
			} else {
				System.err.println("Caught EmptyStackException: There is nothing to pop from the Stack.");
			}
			System.out.println();
			System.out.println("There are currently " + (pushCount-popCount) + " Integers in the Stack.");
			
			
			// Printing the Stack contents back to the user.
			if (!myStack.isEmpty())
				System.out.println("\nStack Contents: " + myStack.printStack());
			else
				System.out.println("There is nothing currently in the Stack.");
			
		}// End iteration loop
		
	} // End Main

} // End StackClient Class
