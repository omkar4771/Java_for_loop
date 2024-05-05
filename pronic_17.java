package for_loop;
import java.util.Scanner;
public class pronic_17 {

	public static void main(String[] args) 
	{
		int i,n,abc=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		n=sc.nextInt();
		for(i=1;i<=(n/2);i++)
		{
		if(n==(i*(i+1)))
		{
			abc=1;
			break;
		}
		}	
		if(abc==1)
		{
			System.out.println("Number is pronic");
		}
		else
		{
			System.out.println("Number is not  pronic");
		}
		
		
	}

}
