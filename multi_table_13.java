package for_loop;

import java.util.Scanner;

public class multi_table_13 {

	public static void main(String[] args)
	{
		int a,i,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		a=sc.nextInt();
		
		for(i=1;i<11;i++)
		{
			sum=a*i;
			System.out.println(a+" * "+i+" = "+sum);
			
		}
	}

}
