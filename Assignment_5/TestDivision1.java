class TestDivision1
{
public static void main(String[] args)
{
int a=10,b=0,c,d,f;

d=a+b;
System.out.println("Addition is :"+d);
try
{
c=a/b;
System.out.println("Division is:"+c);
}
catch(Exception e)
{
System.out.println("We can't divide any no. by zero : "+e);
}
f=a-b;
System.out.println("Substraction is: "+f);
}

}