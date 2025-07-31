import java.util.*;
class RecursionFact
{
int fact(int a)
{
int total=1;
if(a>=1)
{
  total=a*fact(a-1);
}
return total;
}

public static void main(String args[])
{
   int n;
   int result=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a no :");
   n=sc.nextInt();
   RecursionFact ob =new RecursionFact();
   result=ob.fact(n);
   System.out.println("factorial of given no :"+result);
  
}
}