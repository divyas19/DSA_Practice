GFG - Array

Given an array arr of size N, the task is to find the largest element in the given array.
  
import java.io.*;
import java.util.*;

class GFG {
    
   
  static int max(int a[],int n)
  {
      Arrays.sort(a);
      return a[n-1];
  }
   

public static void main(String args[])
{
   
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the no of Elements");
 int n = sc.nextInt();
  int a[] = new int[n];
 for(int i = 0; i < n; i++)
 {
     a[i] = sc.nextInt();
 }
 
 System.out.println(max(a,n));
}

}
