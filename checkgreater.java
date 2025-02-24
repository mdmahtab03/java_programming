public class checkgreater
{
	 public static void main(String[] args) {
		int num1=10,num2=40,c=49;
		if (num1> num2 && num1>c){
			System.out.println("num1 is greater than num2");
		}
		if(num2>c && num2>num1)
		{
		 	System.out.println("num2 is greater than num1");
		}
		if (c>num2&&c>num1)
		{
		  	System.out.println(c);
		}
	}
}