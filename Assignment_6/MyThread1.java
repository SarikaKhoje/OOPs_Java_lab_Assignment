class MyThread1 implements Runnable
{
public void run()
{
System.out.println("Thread My Thread is created");
}
public static void main(String[] args)
{
MyThread1 m1=new MyThread1();
Thread t= new Thread(m1);
t.start();
}
}