import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ElectricBill {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM:yyyy hh:mm");
        String timedate = now.format(formatter);
        System.out.println("Date-" + timedate);
        
        Scanner sc = new Scanner(System.in);
        double consumption;
        double amount;
        int choice;
        correct:
        while (true) {
            System.out.println("Enter mode of consuption ");
            System.out.println("0 For Domestic use \n1 For commercial use");
            choice = sc.nextInt();
            System.out.println("Enter units of consumption");
            consumption = sc.nextInt();
            if (choice == 1) {
                if (0<consumption&&consumption < 100) {
                        amount=consumption*1.5;
                } else if (consumption > 100 && consumption <= 200) {
                        amount=consumption*2.5;
                } else if (consumption > 200) {
                        amount=consumption*4;
                } else {
                    System.out.println("Enter appropriate consumption unit");
                    continue correct;

                }

            } else if (choice == 0) {
                if (0<consumption&&consumption < 100) {
                        amount=consumption*6;
                } else if (consumption > 100 && consumption <= 200) {
                        amount=consumption*8;
                } else if (consumption > 200) {
                    amount=consumption*10;
                } else {
                    System.out.println("Enter appropriate consumption unit");
                    continue correct;

                }
            } 
            else{
                System.out.println("Enter appropriate mode!");
                continue correct;
            }
            System.out.println("Total amout with 5% GST: "+(amount+amount/20));
            break correct;
        }
       
    }
}
