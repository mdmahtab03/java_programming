import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CgpaCalculator {
    public static void main(String args[]) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM:yyyy hh:mm");
        String timedate = now.format(formatter);
        System.out.println("Date-" + timedate);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();
        int[] subjects = new int[n];
        double percentage = 0, cgpa = 0, total = 0;

        for (int count = 0; count < n; count++) {
            System.out.print("Enter " + (count + 1) + " subject mark:");
            subjects[count] = sc.nextInt();
            total += subjects[count];
        }

        percentage = (total / (n * 100)) * 100;
        cgpa = percentage / 9.5;

        System.out.println("Overall percentage of all subjects is :" + percentage);
        System.out.println("Overall CGPA is: " + cgpa);
        System.out.println("Thank you for using percentage to CGPA converter.");

        sc.close(); 
    }
}
