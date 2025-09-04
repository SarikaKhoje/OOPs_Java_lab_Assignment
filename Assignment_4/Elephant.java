import java.util.*;
interface Animal
{
public void voice();
}
class Elephant implements Animal
{
public void voice()
{
System.out.println("In Elephant voice");
}
public static void main(String[] args)
{
Elephant e=new Elephant();
e.voice();
}
}