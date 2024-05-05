package for_loop;
import java.util.*;
public class Sum_09 {

	public static void main(String[] args)
	{
		int i,n,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one number");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
		    sum=sum+i;
		    
		}
		System.out.println("sum="+sum);
	}

}
