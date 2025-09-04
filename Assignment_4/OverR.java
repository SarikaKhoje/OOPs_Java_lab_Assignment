import java.util.*;
class Parent
{
 void display()
{
 System.out.println("In parent class");
}
}
class Child_class extends Parent
{
 void display()
{
 System.out.println("In child class"); 
}
}
class Child1_class extends Parent
{
 void display()
{
  System.out.println("In child 2 class");
}
}
class OverR
{
 public static void main(String args[])
{
 Child_class c=new Child_class();
 c.display();
}
}