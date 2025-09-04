//abstract class
public class abstract Player
{
abstract void fitness();

}
public class Batsman extends Player
{
void fitness()
{
System.out.println("In batsman fitness");
}

public static void main(String [] args)
{
Batsman b=new Batsman();
b.fitness();
}
}