GFG - BST

Given a Singly Linked List which has data members sorted in ascending order. Construct a Balanced Binary Search Tree which has same data members as the given Linked List.
Note: There might be nodes with the same value.
  
//{ Driver Code Starts
import java.util.*;

class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d; 
        next = null;
    }
}

class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }
    
}


class ListToBST
{
    
  /* Function to print linked list */
   public static void preOrder(TNode root)
    {
        
        if(root==null)
            return;
            
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n = sc.nextInt();
			LNode head = new LNode(sc.nextInt());
            LNode tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new LNode(sc.nextInt());
                tail = tail.next;
            }
		
			Solution obj = new Solution();
			TNode root = obj.sortedListToBST(head);
			preOrder(root);
			
			System.out.println();
			
			t--;
			
         }
    }
}

// } Driver Code Ends


//User function Template for Java

/*Linked List Node
class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d; 
        next = null;
    }
}

//Tree Node
class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }
    
}*/

class Solution
{
ArrayList<Integer> al = new ArrayList<Integer>();
public static TNode insert(ArrayList<Integer> al,int l,int h)
{
int m = (l+h+1)/2;
if(l>h)
{
    return null;
}
TNode root = new TNode(al.get(m));
root.left=insert(al,l,m-1);
root.right=insert(al,m+1,h);

return root;
}

    public TNode sortedListToBST(LNode head)
    {
        //code here
        
        LNode l = head;
        while(l != null)
        {
            al.add(l.data);
            l=l.next;
        }
        Collections.sort(al);
        return insert(al,0,al.size()-1);
    }
}
