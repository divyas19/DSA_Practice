GFG - Tree

Given a Binary Tree having positive and negative nodes. Find the maximum sum of a level in the given Binary Tree.
  
//{ Driver Code Starts
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Main {
    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
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
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String s = br.readLine().trim();
            Node root = buildTree(s);

            Solution g = new Solution();
            System.out.println(g.maxLevelSum(root));
        }
    }
}
// } Driver Code Ends


/*Complete the finction below
Node is as follows
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/
class Solution {
    public int maxLevelSum(Node root) {
        // add code here.
        Queue<Node> q = new LinkedList<Node>();
         if(root == null){
           return 0;
       }
       int maximum = root.data;
        q.add(root);
        while(!q.isEmpty())
        {
            int sum =0;
          
           
            int size = q.size();
            while(size >0)
            {
                  Node curNode = q.remove();
                 sum = sum+curNode.data;
                 if(curNode.left!= null)
        q.add(curNode.left);
         if(curNode.right != null)
        q.add(curNode.right);
        size--;
            }
            maximum = Math.max(maximum,sum);
        }
        return maximum;
    }
}
