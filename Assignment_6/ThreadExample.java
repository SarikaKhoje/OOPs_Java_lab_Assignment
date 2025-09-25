import java.util.*;
class MyThread extends Thread
{
public void run()
{
System.out.println("Thread extending Thread class is running");
int a=5,b=7,c=a+b;
System.out.println("Additon is :"+c);
}
}

class ThreadExample
{
public static void main(String[] a)
{
MyThread t=new MyThread();
t.start();
}
}