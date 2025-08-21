import java.util.*;
public class Addition
{
int add(int a,int b)
{
return a+b;
}
float add(float a,float b)
{
return a+b;
}
double add(double a,double b)
{
return a+b;
}
void add()
{
int a=10,b=20;
int c=a+b;
System.out.println("Addition is "+c);
}
public static void main(String args[])
{
Addition a=new Addition();
System.out.println("Addition is int :"+a.add(2,4));
System.out.println("Addition float :"+a.add(1.2f,1.4f));
System.out.println("Addition Double :"+a.add(2.4,4.5));
a.add();
}

}
