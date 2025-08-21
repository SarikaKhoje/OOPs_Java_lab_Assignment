import java.util.*;
class Parent
{
int a,b;
Scanner sc=new Scanner(System.in);

void input()
{
a=sc.nextInt();
b=sc.nextInt();
}
}
public class Child extends Parent
{
int c;
void add()
{
c=a+b;
System.out.println("Addition is :"+c);
}
public static void main(String args[])
{
Child c=new Child();
c.input();
c.add();
}


}