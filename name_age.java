import java.util.*;
class name_age 
{
	public static void main(String[] args) {
		int age;
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name and age");
		name = sc.nextLine();//System.console().readLine();
		age = sc.nextInt();
		for (int i=1; 	i<=age	;i++ 	) {
			System.out.println("   " +name);

		}

	}
}