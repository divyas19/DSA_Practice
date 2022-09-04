GFG - Stacks

Design a data-structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should 
return minimum element from the SpecialStack. Your task is to complete all the functions, using stack data-Structure.
  
//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isEmpty(s)){
			    g.pop(s);
			}
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}
// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
    int min = Integer.MAX_VALUE;
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	    if(a<min)
	    min = a;
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            if(s.isEmpty())
            return -1;
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
          return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size()==n)
           return true;
           
           return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.size() ==0 )
           return true;
           
           return false;
	}
}
