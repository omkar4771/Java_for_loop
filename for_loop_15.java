package for_loop;

import java.util.Scanner;

public class for_loop_15 {

	public static void main(String[] args) 
	{
		int x,n,i,f1=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		x=sc.nextInt();
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			f1=f1*x;
		}
		System.out.println(" "+f1);
		
		
	}

}
