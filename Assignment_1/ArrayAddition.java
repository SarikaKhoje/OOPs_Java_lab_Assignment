import java.util.*;
public class ArrayAddition
{
    public static void main(String args[])
{
    int a[]=new int[5];
    int result,i;
    System.out.println("Enter a 5 numbers :");
    Scanner s=new Scanner(System.in);
    result=0;
    for(i=0;i<5;i++)
    {
     a[i]=s.nextInt();
     result+=a[i];
    }
    System.out.println("Total sum is :"+result);
    
  }  
   

}