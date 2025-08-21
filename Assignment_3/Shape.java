import java.util.*;
public class Shape
{
 void area()
{
int b=10,h=20;
int t=b*h;
System.out.println("Area of Rectangle is :"+t);
}
double area(double b,double h)
{
double t=0.5*b*h;
return t;
}
double area(double r)
{
double t=3.14*r*r;
return t;

}
public static void main(String args[])
{
Shape s=new Shape();
s.area();
System.out.println("Area of Triangle is :"+s.area(10,5));
System.out.println("Area of Circle is :"+s.area(4));

}
}