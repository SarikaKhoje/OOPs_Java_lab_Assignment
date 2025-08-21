import java.util.*;
class Parent
{
    void display()
    {
        System.out.println("In parent class");
    }
}
class Child extends Parent
{
    void display()
    {
        System.out.println("In child class");
    }
}
class Overriding
{
    public static void main(String [] args)
    {
         Child c=new Child();
         c.display();
    }
   
}