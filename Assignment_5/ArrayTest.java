import java.util.*;
class ArrayTest
{
public static void main(String[] args)
{
int arr[]={1,2,3,4,5};
try
{
System.out.println(arr[2]);
System.out.println(arr[5]);
}
catch(Exception e)
{
System.out.println("Array size is 5 we can not access 6 element");
}
System.out.println(arr[3]);

}
}