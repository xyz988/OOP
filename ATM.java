import java.util.Scanner;
public class ATM{
    private double balance = 10000;
    public void checkBalance(){
        System.out.println("Current Balance :"+balance);
    }

    public void deposite(double amount){
        if(amount == 0)
            throw new IllegalArgumentException("Amount must be greater than zero");
        balance+= amount;
        System.out.println(amount+"Deposited Successful");
    }

    public void withdraw(double amount){
        if(amount<=0)
            throw new IllegalArgumentException("Withdraw Amount must be greater than zero");
        if(amount>balance)
            throw new ArithmeticException("Insufficeient funds in account");
        balance = amount;
        System.out.println(amount+"Withdraw Successfully");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        while(true){
            System.out.println("\n ATM MENU");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposite Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");

            System.out.println("Enter your Choice");
            try{
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        atm.checkBalance();
                        break;
                    
                    case 2:
                        System.out.println("Enter the deposite amount:");
                        atm.deposite(sc.nextDouble());
                        break;

                    case 3:
                         System.out.println("Enter the withdraw amount:");
                         atm.withdraw(sc.nextDouble());
                         break;

                    case 4:
                         System.out.println("Thank You for using ATM!");
                         sc.close();
                         break;

                    default:
                        System.out.println("Invalid Choice");
                }
            }
            catch(ArithmeticException e)
            {
                System.out.println("Error"+e.getMessage());
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Error"+e.getMessage());
            }
            catch(Exception e)
            {
                System.out.println("Invalid Input");
                sc.nextLine();
            }
            finally{
                System.out.println("Transaction Process Completed");
            }

        }
    }
}