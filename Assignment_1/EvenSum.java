import java.util.*;
class EvenSum
{
public static void main(String args[])
{
   int sumeven=0,sumodd=0,n,i;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of element in array :");
   n=sc.nextInt();
   int a[]=new int[n];
System.out.println("Enter a element :");
   for(i=0;i<n;i++)
{
   a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]%2==0)
{
sumeven+=a[i];
}
else
{
sumodd+=a[i];
}
}
System.out.println("Sum of even :"+sumeven);
System.out.println("Sum of odd :"+sumodd);

}
}