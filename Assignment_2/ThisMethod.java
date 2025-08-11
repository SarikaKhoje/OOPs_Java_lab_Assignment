import java.util.*;
class ThisMethod
{
void display()
{
this.show();
System.out.println("In Display");
}
void show()
{
System.out.println("In show");
}
public static void main(String args[])
{
ThisMethod o= new ThisMethod();
o.display();
}
}