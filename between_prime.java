
class between_prime
{
	public static void main(String[] args)
	{
		int n=50;
		for(int i=1;i<=50;i++)
		{
			System.out.println("first"+i);
			for(int j=2;j<=i/2; j++)
				System.out.print("second"+i);
		}
	}
}