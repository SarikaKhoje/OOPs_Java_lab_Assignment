import java.util.*;
class Multi extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("Thread "+i+" is running");
}
}
public static void main(String[] args)
{
Multi m1=new Multi();
Multi m2=new Multi();
Multi m3 =new Multi();
m1.start();
m2.start();
m3.start();
}
}