import java.util.*;
class MyRunnable implements Runnable
{
public void run()
{
System.out.println("Thread is running.....");
int a=5,b=4,c=a*b;
System.out.println("Multiplication is :"+c);
}
}

public class ThreadExample1
{
public static void main(String[] args)
{
MyRunnable runnable=new MyRunnable();
Thread t1=new Thread(runnable);
t1.start();
}
}