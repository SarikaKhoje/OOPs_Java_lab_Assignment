import java.util.*;
class NFException
{
public static void main(String [] args)
{
try
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter string :");
String s=sc.next();
int a=Integer.parseInt(s);
System.out.println(a);
}
catch(Exception e)
{
System.out.println("character or string can not converted in to integer");
}
}
}