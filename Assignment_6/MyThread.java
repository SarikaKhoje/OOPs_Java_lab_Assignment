public class MyThread extends Thread
{
public void run()
{
System.out.println("Thread My Thread is created");

}
public static void main(String[] args)
{
MyThread m= new MyThread();
m.start();
}
}