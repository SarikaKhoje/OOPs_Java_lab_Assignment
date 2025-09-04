import java.util.*;
interface Father
{
public void bringWater();
}
interface Mother
{
public void bringWater();
}
public class Son1 implements Father,Mother
{
public void bringWater()
{
System.out.println("Brought water for Father and Mother");
}
public static void main(String [] args)
{
Son1 s=new Son1();
s.bringWater();
SonChild1 s1=new SonChild1();
s1.bringWater();
SonChild2 s2=new SonChild2();
s2.bringWater();
}
}
class SonChild1 extends Son1
{
public void bringWater()
{
System.out.println("Brought water for parent");
}
}
class SonChild2 extends Son1
{
public void bringWater()
{
System.out.println("Brought water for parent");
}
}