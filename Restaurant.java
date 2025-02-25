import java.util.*;


public class Restaurant {

    int count = -1;
    int[] quantity = new int[10];
    double[] price = new double[10];
    String[] itemName = new String[10];

    void generateBill() {
        double total = 0;
        for (int i = 0; i <= this.count; i++) {
            total = total + price[i];
        }
        total = total + total / 10;
        displayitems();
        System.out.println("||\t\t\tGrand total with 10% GST\t" + total + "  ||");
        System.out.println("---------------------------------------------------------------");

    }

    void additem(int quantity, double price, String itemName) {
        count++;
        this.quantity[count] = quantity;
        this.price[count] = quantity * price;
        this.itemName[count] = itemName;

    }

    void displayitems() {
        if (count != -1) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("|| SN. \t\t Item Name \t\t Quantity \t Price  ||");
            System.out.println("------------------------------------------------------------------");
            for (int i = 0; i <= count; i++) {
                System.out.println("||  " + (i + 1) + "\t\t" + itemName[i] + "\t\t    " + quantity[i] + "\t\t "
                        + price[i] + "  ||");
            }
            System.out.println("-----------------------------------------------------------------");
        } else
            System.err.println("There is no any items selected yet.");
    }

    void removeitem(int deleChoice) {
        if (deleChoice - 1 == this.count)
            count--;
        else if ((deleChoice - 1) >= 0 && (deleChoice - 1) < this.count) {
            for (int i = deleChoice - 1; i < count; i++) {
                this.itemName[i] = this.itemName[i + 1];
                this.price[i] = this.price[i + 1];
                this.quantity[i] = this.quantity[i + 1];
            }
            count--;
        } else {
            System.out.println("Enter a valide choice");

        }

    }

    public static void main(String[] args) {
        Restaurant finnalbill = new Restaurant();
        int choice, deleChoice, quantity;
        String agree;
        boolean repeat = true;
        Scanner sc = new Scanner(System.in);
        Scanner agreeIn = new Scanner(System.in);
        while (repeat) {
            System.out.println("=====================================================");
            System.out.println("||          Welcome to Five Star Restaurant        ||");
            System.out.println("||         Sr.no.       Item Name         Price    ||");
            System.out.println("||            1.      Chiken Biryani       120     ||");
            System.out.println("||            2.      Mutton Biryani       160     ||");
            System.out.println("||            3.      Chiken lolipop        80     ||");
            System.out.println("||            4.      Mutton lolipop       100     ||");
            System.out.println("||            5.          Dalheem           90     ||");
            System.out.println("||            6.           keema            60     ||");
            System.out.println("||            7.       water bottle         20     ||");
            System.out.println("||            8.            Tea             20     ||");
            System.out.println("=====================================================");
            System.out.println("|| 9. Remove item   10. Bill    11. Edit Quantity  ||");
            System.out.println("|| 12. Display                                     ||");
            System.out.println("=====================================================");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Enter quantity:");
                    quantity = sc.nextInt();
                    finnalbill.additem(quantity, 120, "chiken biryani");
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Enter quantity:");
                    quantity = sc.nextInt();
                    finnalbill.additem(quantity, 160, "Mutton biryani");
                    break;
                case 3:
                System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Enter quantity:");
                    quantity = sc.nextInt();
                    finnalbill.additem(quantity, 80, "chiken lolipop");
                    break;
                case 4:
                System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Enter quantity:");
                    quantity = sc.nextInt();
                    finnalbill.additem(quantity, 100, "Mutton lolipop");
                    break;
                case 5:
                System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Enter quantity:");
                    quantity = sc.nextInt();
                    finnalbill.additem(quantity, 90, "Dalheem       ");
                    break;
                case 6:
                System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Enter quantity:");
                    quantity = sc.nextInt();
                    finnalbill.additem(quantity, 60, "Keema         ");
                    break;
                case 7:
                System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Enter quantity:");
                    quantity = sc.nextInt();
                    finnalbill.additem(quantity, 20, "Water bottle  ");
                    break;
                case 8:
                System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Enter quantity:");
                    quantity = sc.nextInt();
                    finnalbill.additem(quantity, 10, "Tea           ");
                    break;
                case 9:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    finnalbill.displayitems();
                    System.out.print("Enter the serial nunber of item which you want to remove:");
                    deleChoice = sc.nextInt();
                    finnalbill.removeitem(deleChoice);
                    break;
                case 10:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    finnalbill.generateBill();
                    System.out.println("Thank you for visiting heeheheheh.......");
                    repeat=false;
                    break;
                case 11: // edit quantity
                case 12:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    finnalbill.displayitems();
                    System.out.println("Press any key to continue");
                    agree = agreeIn.nextLine(); 
                    System.out.print("\033[H\033[2J");
                    System.out.flush();                
                    break;

            }
        }
        sc.close();
        agreeIn.close();
    }
}