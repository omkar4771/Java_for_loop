package for_loop;

import java.util.Scanner;

public class Factorial_14 {

	public static void main(String[] args)
	{
		int n,i,f1=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		n=sc.nextInt();
	
		for(i=n;i>0;i--)
		{
			f1=f1*i;
			
		}
		System.out.println("Factorial = "+f1);
	
	}

}
