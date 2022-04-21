GFG - Array

Positive elements at even and negative at odd positions (Relative order not maintained)

import java.io.*;
import java.util.Scanner;

class GFG {
    
    static void rearrange(int a[], int no)
{
    int p = 0, n = 1, t;
    
    while(true){
    while(p < no && a[p] >= 0)
    {
        p+=2;
    }
    
    while(n < no && a[n] <= 0)
    {
        n+=2;
    }
    
    if(p< no && n < no)
    {
        t = a[p];
        a[p] = a[n];
        a[n] = t;
    }
    else
      break;
      
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
