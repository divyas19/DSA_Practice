GFG - Array

Rearrange array such that even index elements are smaller and odd index elements are greater

import java.io.*;
import java.util.*;

class GFG {
    
    static void rearrange(int a[], int no)
{
    // int p = 0, n = 1, t;
    
    for(int p = 0,n = 1; p < no && n < no;p+=2,n+=2)
    {
        if(a[p] > a[n])
        {
            int t = a[p];
            a[p] = a[n];
            a[n] = t;
        }
    }
    
   
      
}


public static void main(String args[])
{
   
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the no of Elements");
 int no = sc.nextInt();
  int a[] = new int[no];
 for(int i = 0; i < no; i++)
 {
     a[i] = sc.nextInt();
 }
 
 rearrange(a,no);
 
 for(int i = 0; i < no; i++)
 {
     System.out.print(a[i]+" ");
 }
}

}
