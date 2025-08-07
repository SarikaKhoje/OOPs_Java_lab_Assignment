import java.util.*;
class OverLodding
{
int emp_id;
int salary;
String name;
String dept;
public OverLodding()
{
Scanner sc=new Scanner(System.in);
System.out.println("Employe ID :");
emp_id=sc.nextInt();
System.out.println("Employe Name :");
name=sc.next();
System.out.println("Department :");
dept=sc.next();
System.out.println("Salary :");
salary=sc.nextInt();

System.out.println("Employe Name : "+name+" ID : "+emp_id+" Salary : "+salary+" Department : "+dept);



}
public OverLodding(int id,String n,int sal)
{
System.out.println("Employe Name : "+n+" ID : "+id+" Salary : "+sal);

}
public OverLodding(int id,String n,String de)
{
System.out.println("Employe Name : "+n+" ID : "+id+" Department : "+de);

}
public static void main(String args[])
{
int emp_id;
int salary;
String name;
String dept;
Scanner sc=new Scanner(System.in);
System.out.println("Employe ID :");
emp_id=sc.nextInt();
System.out.println("Employe Name :");
name=sc.next();
System.out.println("Department :");
dept=sc.next();
System.out.println("Salary :");
salary=sc.nextInt();

OverLodding e=new OverLodding();
OverLodding e1=new OverLodding(emp_id,name,salary);
OverLodding e2=new OverLodding(emp_id,name,dept);


}
}