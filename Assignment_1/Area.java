import java.util.*;
class Triangle
{
  double area_triangle(double a,double b)
{
    double c=0.5*a*b;
    return c; 
}
double area_circle(double r)
{
    double d=3.142*r*r;
    return d;
}
}
class Area
{
public static void main(String args[])
{  
  Scanner sc=new Scanner(System.in);
  Triangle t=new Triangle();
  int choice,ch;
  double a,b,c;
  do{
     System.out.println("1.Triangle");
     System.out.println("2.Circle");
     System.out.println("Enter your choice :");
     choice=sc.nextInt();
     switch(choice)
     {
        case 1:
               System.out.println("Enter height and base :");
               
               a=sc.nextDouble();
               b=sc.nextDouble();
               c=t.area_triangle(a,b);
               System.out.println("Area of triangle is :"+c);
               break;

       case 2:
             System.out.println("Enter radius :");
             a=sc.nextInt();
             c=t.area_circle(a);
             System.out.println("Area of Circle :"+c);
             break;
      }
     System.out.println("do u want to continue(1/0) :");
     ch=sc.nextInt();    

     }while(ch==1);
  
}
}