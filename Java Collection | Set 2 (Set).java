GFG - Set

Implement different operations on a set s .

Input:
The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. The first line of input contains an integer Q denoting the no of 
queries . Then in the next line are Q space separated queries .
A query can be of four types 
1. a x (inserts an element x to the set s)
2. b (prints the contents of the set s in increasing order)
3. c x (erases an element x from the set s)
4. d x (prints 1 if the element x is present in the set else print -1)
5. e (prints the size of the set s)

Output:
The output for each test case will  be space separated integers denoting the results of each query .
  
//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class Collections_Set_1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Set<Integer> s = new HashSet<Integer>() ;
			int q = sc.nextInt();
			
			while(q>0)
			{
				GfG g = new GfG();
				char c = sc.next().charAt(0);
				if(c == 'a')
				{
					int x = sc.nextInt();
					g.insert(s,x);
				}
				if(c =='b')
				{
					g.print_contents(s);
				}
				if(c == 'c')
				{
					int x = sc.nextInt();
					g.erase(s,x);
				}
				if(c == 'd')
				{
					int x = sc.nextInt();
					System.out.print(g.find(s,x)+" ");
				}
				if(c == 'e')
				System.out.print(g.size(s)+" ");
			q--;
			//System.out.println();
			}
		t--;
		System.out.println();
		}
	}
}
// } Driver Code Ends


/* You are required to complete below methods */
class GfG
{
    /*inserts an element x to the set s */
    void insert(Set<Integer> s, int x)
    {
	// Your code here
	s.add(x);
    }
	
    /*prints the contents of the set s in ascending order */
    void print_contents(Set<Integer> s)
    {
	// Your code here
	ArrayList<Integer> al = new ArrayList<Integer>();
    for (int v : s)
    {
    al.add(v);
    }
    Collections.sort(al);
	for(int i =0; i < al.size();i++)
	{
	    System.out.print(al.get(i)+" ");
	}
    }
	
    /*erases an element x from the set s */	
    void erase(Set<Integer> s, int x)
    {
	// Your code here
	s.remove(x);
    }
	
    /*returns the size of the set s */
    int size(Set<Integer> s)
    {
        // Your code here
        return s.size();
    }
		
    /*returns 1 if the element x is
    present in set s else returns -1 */
    int find(Set<Integer> s, int x)
    {
	// Your code here
	if(s.contains(x))
	{
       return 1;
    }
     return -1;
    }
}
