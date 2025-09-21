import java.util.*;
public class Prime
{
public static void main(String args[])
{
   int n,i;
   int flag=0;
   System.out.println("Enter no :");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   for(i=2;i<n;i++)
{
    if(n%i==0 || n<=0)
{
System.out.println("Not prime");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("Prime");
}
   
}
}
