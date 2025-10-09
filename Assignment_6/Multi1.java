import java.util.*;
class Multi1 implements Runnable
{
public void run()
{
for(int i=0;i<5;i++)
System.out.println("Thread "+Thread.currentThread().getName()+" is running");
}
public static void main(String[] args)
{
Multi1 m=new Multi1();
Thread t1=new Thread(m,"SY-A");
Thread t2=new Thread(m,"SY-B");
Thread t3 =new Thread(m,"SY-D");

t1.setPriority(1);
t2.setPriority(2);
t3.setPriority(3);
System.out.println(t1.getPriority());
System.out.println(t2.getPriority());
System.out.println(t3.getPriority());
t1.start();
t2.start();
t3.start();

}
}