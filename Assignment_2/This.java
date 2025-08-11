import java.util.*;
class This{
int roll;
String name;
int marks;
public This(int roll,String name,int marks)
{
  this.roll=roll;
  this.name=name;
  this.marks=marks;
}
void display()
{
  System.out.println("Name : "+name+"\nRoll no : "+roll+"\nMarks : "+marks);
}

public static void main(String args[])
{
int roll;
int marks;
String name;
Scanner sc=new Scanner(System.in);
System.out.println("Enter name :");
name=sc.next();
System.out.println("Roll no :");
roll=sc.nextInt();
System.out.println("Marks :");
marks=sc.nextInt();

This t=new This(roll,name,marks);
t.display();
}
}