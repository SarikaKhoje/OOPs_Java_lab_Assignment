import java.util.*;
class Employe
{
int salary=50000;
void display()
{
System.out.println("In Employe class");
}
}
public class Programmer extends Employe
{
int bonus=10000;
void show()
{
System.out.println("In Programmer class");
}
public static void main(String args[])
{
Programmer p=new Programmer();
int total=p.salary+p.bonus;
System.out.println("Total is :"+total);
p.display();
p.show(); 
}
}
