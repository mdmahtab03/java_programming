import java.util.*;
class prime
{
	public static void main(String[] args)
	{
		int n,flag = 1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number which you want to check is prime or not");
		n= sc.nextInt();
		x: for(int i=2;i<=n/2;i++)
		{
			if (n%i==0) 
			{
			flag=0;
			break x;	
			}
		}
			if ( flag == 0)
			{
				System.out.print("number is not a prime ");
				
			}
			else
			{
				System.out.print("number is prime");
			}
	}
}