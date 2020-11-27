public class Factorial 
{
	public static void main (String[] args) 
	{		int num=Console.readInt();
			int factorial=1;
			for(int D=num;D>0;D--)
			{factorial=factorial*D;
			}
		System.out.println("factorial="+factorial);
	}
}
