
import java.util.Scanner;

class Account {
    private double totalbalance;

    public Account(double totalbalance)
    {
        this.totalbalance = totalbalance;
    }

    public void cashWithdraw(double amount) 
    {
        if (totalbalance >= amount) 
        {
            totalbalance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        totalbalance += amount;
        System.out.println("Deposit successful.");
    }

    public void checkBalance() {
        System.out.println("Balance: " + totalbalance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    account.cashWithdraw(withdrawAmount);cashWithdraw(withdrawAmount);
                                        break;
                                    case 2:
                                        System.out.println("Enter amount to deposit:");
                                        double depositAmount = scanner.nextDouble();
                                        account.deposit(depositAmount);
                                        break;
                                    case 3:
                                        account.checkBalance();
                                        break;
                                    case 4:
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Invalid choice.");
                                }
                            }
                        }
                    
                        private static void cashWithdraw(double withdrawAmount) {
                            // TODO Auto-generated method stub
                            throw new UnsupportedOperationException("Unimplemented method 'cashWithdraw'");
                        }
}