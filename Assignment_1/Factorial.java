import java.util.*;
public class Factorial
{
   public static void main(String args[])
    {
      int a,i,c=1;
      System.out.println("Enter a no :");
      Scanner b=new Scanner(System.in);
      a=b.nextInt();
     
      for(i=1;i<a;i++)
      {
       c+=i*c;
      //System.out.println("c :"+c);
      
      } 
      System.out.println("factorial is :"+c);
     }
}