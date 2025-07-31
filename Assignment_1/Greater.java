import java.util.*;
public class Greater
{
 public static void main(String args[])
{
   int a,b;
System.out.println("Enter Two no :");
Scanner c=new Scanner(System.in);
a=c.nextInt();
b=c.nextInt();
if(a==b)
{
  System.out.println(a+" and "+b+" are equal");
}
else if(a>b)
{
 System.out.println(a+"is greater");
 System.out.println(b+"is smaller");
}
else
{
System.out.println(b+"is greater");
System.out.println(a+"is smaller");
}  
}
}