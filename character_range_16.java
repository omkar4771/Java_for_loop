package for_loop;
import java.util.Scanner;
public class character_range_16 
{
	public static void main(String[] args)
	{
		char ch;
		int n;
		String s1;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter character & range");
		s1=sc.next();
		ch=s1.charAt(0);
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		System.out.print("\t"+(ch++));

		}
	}

}
