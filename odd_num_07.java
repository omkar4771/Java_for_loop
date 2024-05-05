package for_loop;
import java.util.*;
public class odd_num_07
{

	public static void main(String[] args) 
	{//1,3,5,7,9
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		n=sc.nextInt();
		for(i=1;i<=n;i=i+2)
	{
	System.out.print("  "+i);
	}
	}

}
