GFG - Tree

Given a Binary Tree of size N, your task is to complete the function sumBt(), that should return the sum of all the nodes of the given binary tree.
  
//{ Driver Code Starts
//Initial Template for Java

//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s1 = br.readLine();
    	    	String s2 = br.readLine();
    	    	Node root1 = buildTree(s1);
    	    	Node root2 = buildTree(s2);
                Solution g = new Solution();
            //System.out.println(g.isIdentical(root,roott));
			    boolean b = g.isIdentical(root1,root2);
			    if(b==true)
				    System.out.println("Yes");
			    else
				    System.out.println("No");
	        }
	}
}


// } Driver Code Ends


//User function Template for Java



/*

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/


class Solution
{
    //Function to check if two trees are identical.
public static ArrayList<Integer> addData(Node node,ArrayList<Integer> al)
{
Queue<Node> q = new LinkedList<Node>();
q.add(node);
q.add(null);
while(!q.isEmpty())
{
    Node curNode = q.remove();
    if(curNode == null)
    {
        //System.out.println();
        if(q.isEmpty())
        {
            break;
        }
        else
        q.add(null);
    }
    else
    {
        //System.out.println(curNode.data);
        al.add(curNode.data);
        if(curNode.left!= null)
        q.add(curNode.left);
         if(curNode.right != null)
        q.add(curNode.right);
            
    }
}    
return al;

}

    
    
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    ArrayList<Integer> al1= new ArrayList<Integer>();
	    ArrayList<Integer> al2= new ArrayList<Integer>();
	    addData(root1, al1);
	    addData(root2, al2);
	    if(al1.size() != al2.size())
	    return false;
	    for(int i = 0 ; i < al1.size();i++)
	    {
	        if(!al1.get(i).equals(al2.get(i)))
	        return false;
	    }
	    return true;
	}
	
}

// if(root1==null && root2==null)

//          return true;

// if((root1!=null && root2==null) || (root1==null && root2!=null) || (root1.data!=root2.data))

//          return false;

// return (isIdentical(root1.left,root2.left)&&isIdentical(root1.right,root2.right));
