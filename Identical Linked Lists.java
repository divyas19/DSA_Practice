GFG - Linked List

Given two Singly Linked List of N and M nodes respectively. The task is to check whether two linked lists are identical or not. 
Two Linked Lists are identical when they have same data and with same arrangement too.
  
// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    
		    Node head1 = null, head2 = null, tail1 = null, tail2 = null;
		    
		    //Input first LL
		    int n1 = sc.nextInt();
            int d1 = sc.nextInt();		    
		    head1 = new Node(d1);
		    tail1 = head1;
		    
		    while(n1-- > 1){
		        Node n = new Node(sc.nextInt());
		        tail1.next = n;
		        tail1 = tail1.next;
		    }
		    
		    //Input second LL
		    int n2 = sc.nextInt();
            int d2 = sc.nextInt();		    
		    head2 = new Node(d2);
		    tail2 = head2;
		    
		    while(n2-- > 1){
		        Node n = new Node(sc.nextInt());
		        tail2.next = n;
		        tail2 = tail2.next;
		    }
		    
		    Solution obj = new Solution();
		    if(obj.isIdentical(head1, head2))
		        System.out.println("Identical");
		    else   
		        System.out.println("Not identical");
		    
		}
	}
	
	public static void po(Object o){
	    System.out.println(o);
	}
	
	public static void show(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}
// } Driver Code Ends


/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        if(head1 == null && head2 == null)
        return true;
        
        if(head1.next == null && head2.next == null)
        {
            if(head1.data == head2.data)
            {
                return true;
            }
            return false;
        }
        
         Node te1 = head1;
        Node te2 = head2;
        int c1 = 0;
        int c2 = 0;
        while(te1!= null)
        {
            te1 = te1.next;
            c1++;
        }
        
         while(te2!= null)
        {
            te2 = te2.next;
            c2++;
        }
        
        if(c1 != c2)
        return false;
        
        Node t1 = head1;
        Node t2 = head2;
        while(t1.next != null && t2.next != null){
       if(t1.data!=t2.data){
           return false;
       }
       t1=t1.next;
       t2=t2.next;
       
   }
   
   if( (t1.next == null && t2.next!= null) || (t1!= null && t2 == null)){
       return false;
   }
   
   return true;
    }
}
