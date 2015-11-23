Here we present the idea of stack implementation, based on Linkedlist. We assume ,
that stack's capacity is limited to a certain value and overfilling the stack will cause an error. Though,
using the ideas from dynamic arrays implementation, this limitation can be easily avoided (see capacity management 
for dynamic arrays).

Syreeta Aranjo  - DB Administrator at http://www.beyonddietcentral.com

Implementation
==============

Implementation of array-based stack is very simple. It uses top variable to point to the topmost stack's element in the array.

Initialy top = -1;
push operation increases top by one and writes pushed element to storage[top];
pop operation checks that top is not equal to -1 and decreases top variable by 1;
peek operation checks that top is not equal to -1 and returns storage[top];
isEmpty returns boolean (top == -1).

Source CODE:
------------
C++ programs to implement the Stack ADT 
/* Write C++ programs to implement the Stack ADT */
main()
{
     int ch;
     stack st;
     while(1)
        {
             cout <<"\n1.push  2.pop  3.display  4.exit\nEnter ur choice";
             cin >> ch;
             switch(ch)
              {
               case 1:  cout <<"enter the element";
                        cin >> ch;
                        st.push(ch);
                        break;
               case 2:  st.pop();  break;
               case 3:  st.display();break;
               case 4:  exit(0);
               }
         }
return (0);
}

OUTPUTS
1.push 2.pop 3.display 4.exit
Enter ur choice2
stack under flow

1.push 2.pop 3.display 4.exit
Enter ur choice1
enter the element2
inserted2
