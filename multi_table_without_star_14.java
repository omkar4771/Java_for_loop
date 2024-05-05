package for_loop;

import java.util.*;

public class multi_table_without_star_14
{

	public static void main(String[] args)
	{
		int a,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		a=sc.nextInt();
		
		for(i=1;i<11;i++)
		{
			sum=sum+a;
			System.out.println(a+" * "+i+" = "+sum);
			
		}
	}

}
