import java.util.*;
class Employe3
{
int emp_id;
String name;
int salary;

public Employe3(int emp_id,String name,int salary)
{
this.emp_id=emp_id;
this.name=name;
this.salary=salary;

}
void display()
{
System.out.println("Employe id :"+emp_id);
System.out.println("Employe name :"+name);
System.out.println("Employe salary :"+salary);
}
public static void main(String args[])
{
int emp_id;
String name;
int salary;
Scanner sc =new Scanner(System.in);
System.out.println("Employe id :");
emp_id=sc.nextInt();
System.out.println("Employe name :");
name=sc.next();
System.out.println("salary :");
salary=sc.nextInt();
Employe3 e=new Employe3(emp_id,name,salary);
e.display();
}

}