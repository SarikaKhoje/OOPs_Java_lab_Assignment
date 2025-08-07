import java.util.*;
class CopyConstructor
{
int emp_id;
String name;
int salary;
public CopyConstructor(int id,String n)
{
emp_id=id;
name=n;
System.out.println("Employe id: "+emp_id+" Employe name: "+name);
}
public CopyConstructor(CopyConstructor obj,int sal)
{
emp_id=obj.emp_id;
name=obj.name;
salary=sal;
System.out.println("Employe id: "+emp_id+" Employe name: "+name+ " salary : "+salary);

}
public static void main(String args[])
{
int emp_id,salary;
String name;

Scanner sc=new Scanner(System.in);
System.out.println("Employe id :");
emp_id=sc.nextInt();
System.out.println("Employe name:");
name=sc.next();
System.out.println("salary :");
salary=sc.nextInt();

CopyConstructor c=new CopyConstructor(emp_id,name);
CopyConstructor a=new CopyConstructor(c,salary);


}
}