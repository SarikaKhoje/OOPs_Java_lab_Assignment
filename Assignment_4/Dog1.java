class Animal
{
void voice()
{
System.out.println("In Animal Voice");
}
}
public class Dog1 extends Animal
{
void voice()
{
super.voice();
System.out.println("In Dog Voice");
}
public static void main(String [] args)
{
Dog1 d =new Dog1();
d.voice();
}

}