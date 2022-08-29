GFG - Linked List

Let's give it a try! You have a linked list and you have to implement the functionalities push and pop of stack using this given linked list. Your task is to use the 
class as shown in the comments in the code editor and complete the functions push() and pop() to implement a stack. 
  
//{ Driver Code Starts
import java.util.*;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class GfG {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            MyStack obj = new MyStack();
            int Q = sc.nextInt();
            while (Q > 0) {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.print(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
    }
}

// } Driver Code Ends


class MyStack 
{
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }   
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        // Add your code here
        
        StackNode add = new StackNode(a);
         StackNode temp = top;
        if( temp == null)
        {
            top = add;
       
        }
        
        add.next = temp;
        top = add;
        
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        // Add your code here
        
        if(top == null)
        return -1;
        
         StackNode temp = top;
         int t = temp.data;
        
        top = temp.next; 
        
        return t;
        
    }
}
