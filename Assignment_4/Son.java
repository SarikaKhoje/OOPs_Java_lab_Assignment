import java.util.*;
interface Father
{
public void bringWater();
}
interface Mother
{
public void bringWater();
}
public class Son implements Father,Mother
{
public void bringWater()
{
System.out.println("Brought water for Father and Mother");
}
public static void main(String [] args)
{
Father f=new Son();
Mother m=new Son();
Son s=new Son();
f.bringWater();
m.bringWater();
s.bringWater();
}
}