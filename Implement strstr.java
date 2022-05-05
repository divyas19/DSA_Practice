GFG - String

Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. The function
returns and integer denoting the first occurrence of the string x in s (0 based indexing).

Note: You are not allowed to use inbuilt function.
  
// { Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       for(int i = 0; i+x.length()<=s.length(); i++)
       {
            String t = s.substring(i,i+x.length());
          
            if(t.equals(x))
               return i;
       }
       
       return -1;
    }

}
