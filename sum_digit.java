import java.util.*;
class sum_digit
{
  public static void main(String[] args)
   {
	int n=1;
	int r=0;
	int a;
	Scanner sc= new Scanner(System.in)	;
	System.out.println("Enter a three digit number:");
	n = sc.nextInt();
	while(n!=0)
	{
		a=n%10;
		r=r+a;
		n=n/10;
	}
	System.out.println("sum of three digit number is"+r);
	}
}