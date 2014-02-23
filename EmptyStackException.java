/**
*  @Author Magdalene Benson
*  Date: 10/29/2013  
*  Course: COMP2247 Algorithms & Data Structures
*  Assignment: Assignment 5 (EmptyStackException.java)
*  
*  Description: Represents a situation in which the Stack is empty.
*/

@SuppressWarnings("serial")
public class EmptyStackException extends RuntimeException {
   
   /**
   *  Sets up an exception with an appropriate message.
   *  @param error the string with which to tell the user the error type.
   */
   public EmptyStackException(String error) {
      super(error);
   }

}