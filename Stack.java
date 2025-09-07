package stackpersons;

public class Stack {
	 Person arr[];
	 int top;
	 int capacity;
	 
	 Stack(int size){
	        this.capacity = size;   
	        this.top=-1;
	        this.arr = new Person[capacity];
	 }
	 Stack(Person[] inputArr) {
		capacity=inputArr.length;
		arr = new Person[capacity];
		top=-1;
		for(Person p : inputArr)
		{
			if(top<capacity-1) {
				arr[++top]=p;
			}
			else {
				System.out.println("Stack overflow");
				break;
			}
		}
	 }
	 void push(Person p) {
		 if(top==capacity-1) {
			 System.out.println("Stack Overflow "); 
		        return; 
		         } 
		         arr[++top] = p; 
		         System.out.println("Person pushed"); 
		     } 
	void push(Person p1, Person p2) { 
	push(p1); 
    push(p2); 
   } 
   Person pop() { 
     if (top == -1) { 
		System.out.println("Stack Underflow"); 
	    return null; 
	 } 
	  return arr[top--]; 
  } 
  void pop(int n) { 
   if (n > top + 1) { 
    System.out.println("Cannot pop " + n + " Stack only has " + (top + 1)); 
    }  
   else { 
	   System.out.println("Popped " + n + " Persons:"); 
	   for (int i = 0; i < n; i++) { 
	   arr[top--].displayPerson(); 
	  } 
   } 
} 
  void display() { 
		  
    if (top == -1) { 
		  System.out.println("Stack is empty."); 
	 } 
     else { 
	   System.out.println("stack :"); 
		   for (int i = top; i >= 0; i--) { 
	        arr[i].displayPerson(); 
		    } 
		   } 
		  } 
  void display(int n) { 
	  if (n > top + 1) { 
	   System.out.println("there are " + (top + 1) + " persons in stack :"); 
	   display(); 
	  } 
	  else { 
	  System.out.println("Top " + n + " Persons:"); 
	  for (int i = top; i > top - n; i--) { 
	  arr[i].displayPerson(); 
	 }
    }
   }
}
