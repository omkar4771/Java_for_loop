package for_loop;
import java.util.*;
public class Even_sum_10 
{
	public static void main(String[] args) 
	{
	    int i ,n, sum=0;
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter one Number");
		n=sc.nextInt();
		for(i=2;i<=n;i=i+2)
		{
		    sum=sum+i;
		    
		}
		System.out.println("sum="+sum);
		
	}
}
