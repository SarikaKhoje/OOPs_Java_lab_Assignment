import java.util.*;
class Codechef
{
public static void main(String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int v=0;
		while(N>0)
		{
		    while(X<=Y)
		    {
		        N--;
		        X+=X;
		    }
		    v++;
		    
		}
        System.out.println(v+"");

	}
}
