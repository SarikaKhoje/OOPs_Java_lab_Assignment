import java.util.*;
class Employee
{
int salary=50000;
}
class Devopps extends Employee
{
int salary=75000;
void getSalary()
{
System.out.println("Salary of Employe :"+super.salary);
System.out.println("Salary of Devopps Engg. :"+salary);

}
public static void main(String [] args)
{
Devopps d= new Devopps();
d.getSalary();
}

}