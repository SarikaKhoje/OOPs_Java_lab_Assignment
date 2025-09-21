import java.util.*;
class ArrayTest1
{
public static void main(String [] args)
{
try
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=a+b;
System.out.println("Addition is :"+c);
}
catch(Exception e)
{
System.out.println("Enter two arguments from the console");
}

}
}