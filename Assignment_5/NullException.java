import java.util.*;
class NullException
{
public static void main(String[] args)
{
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter String :");
try
{
String s=null;
System.out.println("Length of the String is :"+s.length());
}
catch(Exception e)
{
System.out.println("We can't calculate lenght of null String");
}
}
}