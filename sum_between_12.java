//accpet x & y number from user print sum between x & y number
package for_loop;
import java.util.*;
public class sum_between_12 {

	public static void main(String[] args)
	{
		int x,y,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num x & y ");
		
		x=sc.nextInt();
		y=sc.nextInt();
		for(x=1;x<=y;x++)
		{
			sum=sum+x;
		}
		System.out.println("sum = "+sum);
	}

}
