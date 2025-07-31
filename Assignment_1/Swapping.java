import java.util.*;
class Swapping
{
public static void main(String args[])
{
  System.out.println("Enter two no a and b :");
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  a=a+b-(b=a);
  System.out.println("After Swapping a and b :"+a+" "+b);
}
}