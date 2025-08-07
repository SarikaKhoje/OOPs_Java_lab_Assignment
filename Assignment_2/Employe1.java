class Employe1
{
int emp_id;
String name;
int salary;
public Employe1()
{
emp_id=123;
name="sarika";
salary=1500;
}
void display()
{
System.out.println("Employe id :"+emp_id);
System.out.println("Employe name :"+name);
System.out.println("Employe salary :"+salary);
}
public static void main(String args[])
{
Employe1 e=new Employe1();
e.display();
}

}