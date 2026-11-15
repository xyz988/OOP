import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        id = 0;
        name = "Unknown";
        salary = 0;
    }

    Employee(String name) {
        id = 0;
        this.name = name;
        salary = 0;
    }

    Employee(String name, double salary) {
        id = 0;
        this.name = name;
        this.salary = salary;
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + (salary * 12));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Default Constructor");
            System.out.println("2. Constructor with Name");
            System.out.println("3. Constructor with Name and Salary");
            System.out.println("4. Constructor with All Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            Employee e;

            switch (choice) {
                case 1:
                    e = new Employee();
                    e.display();
                    break;

                case 2:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    e = new Employee(name);
                    e.display();
                    break;

                case 3:
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    e = new Employee(name, salary);
                    e.display();
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary = sc.nextDouble();

                    e = new Employee(id, name, salary);
                    e.display();
                    break;

                case 5:
                    System.out.println("Program Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
