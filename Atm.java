import java.util.Scanner;
public class Atm {
 private static final String User_Id = "1234"; 
 private static final String Pin = "5678"; // 
 private double bal; 
 public static void main(String[] args) {
  Atm atm = new Atm();
  Scanner scanner = new Scanner(System.in);
   System.out.println("-------------------");
  System.out.println("Welcome to the ATM");
   System.out.println("\n-----------------");
  System.out.print("Please enter your user id: ");
 String userId = scanner.nextLine();
System.out.print("Please enter your pin: ");
String Pin = scanner.nextLine();
 if (!userId.equals(User_Id) || !Pin.equals(Pin))
  {
System.out.println("You have  entered Invalid user id or pin");
 return;
}
 while (true) {
 System.out.println("\n-------------------");
 System.out.println("\nATM Menu:");
 System.out.println("\n--------------------");
System.out.println("1.Transactions History");
 System.out.println("2. Withdraw");
 System.out.println("3. Deposit");
 System.out.println("4. Transfer");
 System.out.println("5. Exit");
 System.out.print("Enter option: ");
int opt = scanner.nextInt();
 switch (opt){
 case 1:
atm.TransactionHistory();
break;
case 2:
System.out.print("Enter the amount to withdraw: ");
double wA = scanner.nextDouble();
atm.withdraw(wA);
break;
case 3:
System.out.print("Enter the amount to deposit: ");
double dA = scanner.nextDouble();
atm.deposit(dA);
break;
case 4:
 System.out.print("Enter the amount to transfer: ");
double tA = scanner.nextDouble();
System.out.print(" Please enter the recipient's account number: ");
 String recipient = scanner.next();
 atm.transfer(tA,recipient);
 break;
 case 5:
 System.out.println("Exiting....");
 return;
 default:
  System.out.println("Invalid option.");
break;
 }
}
}
public void TransactionHistory() {
 System.out.println("Transaction History:");
 }
 public void withdraw(double A) {
 if (bal >= A) {
bal-= A;
System.out.println("Rs" + A + " withdrawn successfully.");
System.out.println("New balance: Rs" + bal);
} else {
System.out.println("Insufficient funds.");
 }
}
public void deposit(double A) {
bal+= A;
System.out.println("Rs" + A + " deposited successfully.");
 System.out.println("New balance: Rs" + bal);
    }
    public void transfer(double A, String recipient) {
        if (bal >= A) {
            bal -= A;
            System.out.println("Rs" + A + " transferred to account " + recipient + " successfully.");
            System.out.println("New balance: Rs" + bal);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}