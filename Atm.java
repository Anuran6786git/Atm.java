import java.util.Scanner;
public class Ai {
 private static final String U.I = "6534"; 
 private static final String P = "7542"; 
 private double bal; 
 public static void main(String[] args) {
  Ai ai = new Ai();
  Scanner scanner = new Scanner(System.in);
   System.out.println("-------------------");
  System.out.println("WELCOME TO THE ATM");
   System.out.println("\n-----------------");
  System.out.print("Please enter your user id: ");
 String userId = scanner.nextLine();
System.out.print("Please enter your pin: ");
String Pin = scanner.nextLine();
 if (!userId.equals(U.I) || !Pin.equals(P))
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
ai.TH();
break;
case 2:
System.out.print("Enter the amount to withdraw: ");
double wA = scanner.nextDouble();
ai.W(wA);
break;
case 3:
System.out.print("Enter the amount to deposit: ");
double dA = scanner.nextDouble();
ai.D(dA);
break;
case 4:
 System.out.print("Enter the amount to transfer: ");
double tA = scanner.nextDouble();
System.out.print(" Please enter the recipient's account number: ");
 String r = scanner.next();
 ai.T(tA,r);
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
public void TH() {
 System.out.println("Transaction History:");
 }
 public void W(double A) {
 if (bal >= A) {
bal-= A;
System.out.println("Rs" + A + " withdrawn successfully.");
System.out.println("New balance: Rs" + bal);
} else {
System.out.println("Insufficient funds.");
 }
}
public void D(double A) {
bal+= A;
System.out.println("Rs" + A + " your funds deposited successfully.");
 System.out.println("New balance: Rs" + bal);
    }
    public void T(double A, String recipient) {
        if (bal >= A) {
            bal -= A;
            System.out.println("Rs" + A + " is transferred to account " + r + " successfully.");
            System.out.println("your New balance: Rs" + bal);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
