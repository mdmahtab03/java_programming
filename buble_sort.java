import java.util.*;
class buble_sort
{
	public static void main(String args[]) {
		int arr[],n,i,j,t;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();
		arr = new int[n];
		System.out.println("Enter"+"elements");
		for(i=0;i<n;i++)
		{
			System.out.println("enter number");
			arr[i]=sc.nextInt();
		}
		for(j=0;j<n;j++)
		{
			for(i=0;i<n-j-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}
		}
		System.out.println("Array elements after sorting");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);

		}
	}
}