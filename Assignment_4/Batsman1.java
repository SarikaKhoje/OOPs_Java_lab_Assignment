//abstract class
abstract class Player
{
abstract void fitness();
void play()
{
System.out.println("all player");
}
}
class Batsman1 extends Player
{
void fitness()
{
System.out.println("In batsman fitness");
}

public static void main(String [] args)
{
/*Batsman1 b=new Batsman1();
Bowler b1=new Bowler();
Ar a=new Ar();
b.fitness();
b1.fitness();
a.fitness();*/

Player p=new Batsman1();
p.fitness(); 
p.play();
}
}
class Bowler extends Player
{
void fitness()
{
System.out.println("In bowler fitness");
}
}
class Ar extends Player
{
void fitness()
{
System.out.println("In All rounder fitness");
}
}