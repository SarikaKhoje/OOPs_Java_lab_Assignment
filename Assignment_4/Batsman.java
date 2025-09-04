class Player
{
public Player(int p ,String s)
{
System.out.println("In Player Constructor :"+p+" Team :"+s);
}
}
public class Batsman extends Player
{

public Batsman(String p)
{
super(5,"India");
System.out.println("In Batsman Constructor :"+p);

}
public static void main(String args[])
{
Batsman b=new Batsman("virat");
}

}