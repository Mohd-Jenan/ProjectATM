import java.util.Scanner;
public class ATMSimulation
{
    public static void main(String[] args)
    {
            int balance =100000,withdraw,deposit;
            Scanner sc= new Scanner(System.in);
            while(true)
            {
                System.out.println("Welcome to ATM");
                System.out.println("choose 1 for check balance");
                System.out.println("choose 2 for withdraw");
                System.out.println("choose 3 for deposit");
                System.out.println("choose 4 for exit");
                System.out.println("choose any of them to perform operation");

                int choice=sc.nextInt();
                switch(choice) {
                    case 1:
                        System.out.println("Balance is" + balance);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Enter money you want withdraw");
                        withdraw = sc.nextInt();
                        if (balance >= withdraw)
                        {
                            balance = balance - withdraw;

                            System.out.println("Collect your balance");
                            System.out.println("Remaining balance is" +" "+balance);
                        } else
                        {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("Enter amnt you want to deposit");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Depositted money Successfully");
                        System.out.println("Total money in your Accnt is"+" "+balance);
                        System.out.println("");
                        break;
                    case 4:
                        System.exit(0);
                }
            }
    }
}