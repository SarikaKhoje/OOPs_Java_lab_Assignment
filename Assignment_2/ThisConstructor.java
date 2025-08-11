import java.util.*;
class ThisConstructor
{
int a,b;
public ThisConstructor()
{
this(10,20);
System.out.println(" In no argument");
}
public ThisConstructor(int a,int b)
{
int c=a+b;
System.out.println("In parameterized : Addition is :"+c);
}
public static void main(String args[])
{
ThisConstructor o=new ThisConstructor();
}
}