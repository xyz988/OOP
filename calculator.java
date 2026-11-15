import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter the First No.");
            int num1 = sc.nextInt();

            System.out.println("Enter the Second No:");
            int num2= sc.nextInt();
         
            System.out.println("\n1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("Enter choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Addition:"+(num1+num2));
                    break;
                case 2:
                    System.out.println("Subtraction:"+(num1-num2));
                    break;
                case 3:
                    System.out.println("Multiplication:"+(num1*num2));
                    break;
                case 4:
                    System.out.println("Division:"+(num1/num2));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Do you want to continue(Y/N)");
            choice=sc.next().charAt(0);
        } while (choice=='Y'||choice=='y');
        sc.close();
    }
    
}
