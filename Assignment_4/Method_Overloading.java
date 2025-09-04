import java.util.*;
class Parent
{
 void area()
{
 System.out.println("In parent class");
}
}
class Triangle extends Parent
{
 void area()
{
 System.out.println("In triangle class");
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter base:");
 int a=sc.nextInt();
 System.out.println("Enter height:");
 int b=sc.nextInt();
 double ac=0.5*a*b;
 System.out.println("The area of Triangle:"+ac);
 super.area();
}
}
class Rectangle extends Triangle
{
 void area()
{
 System.out.println("In rectangle class");
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter height:");
 int a=sc.nextInt();
 System.out.println("Enter breadth:");
 int b=sc.nextInt();
 double ac=a*b;
 System.out.println("The area of Rectangle:"+ac);
super.area();
}
}
class Method_Overloading
{
 public static void main(String args[])
{
 Rectangle r=new Rectangle();
 r.area();
}
}
 