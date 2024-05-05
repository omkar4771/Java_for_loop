package for_loop;
import java.util.Scanner;
public class Factor_18 
{

	public static void main(String[] args) 
	{
		int a,i;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		for(i=1;i<=(a/2);i++)
		{
			if(a%i==0)
			{
				System.out.println("  "+i);
			}
		}		
	}
}
