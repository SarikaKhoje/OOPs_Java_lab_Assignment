import java.util.*;
class TestFinally
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number :");
int a=sc.nextInt();
int b=sc.nextInt();
try
{
int c=a/b;
System.out.println("Division is :"+c);
}
catch(Exception e)
{
System.out.println("can not divide by zero");
}
//finally
{
System.out.println("The inputs are :"+a+","+b);
}
}
}