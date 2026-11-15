import java.util.Scanner;

interface Academic{
    void storeAcademicDetails();
    void displayAcademicDetails();

}
interface Sports{
    void storeSportsDetails();
    void displaySportsDetails();
    
}

class student implements Academic,Sports{
        String name;
        int rollNo;
        float percentage;
        String sportName;
        Scanner sc = new Scanner(System.in);

        public void storeAcademicDetails(){
            System.out.println("Enter Student Name:");
            name = sc.nextLine();
            System.out.println("Enter Roll No.:");
            rollNo = sc.nextInt();
            System.out.println("Enter Academic Percentage:");
            percentage = sc.nextFloat();
            sc.nextLine();
        }
        public void displayAcademicDetails(){
            System.out.println("\n Academic Details:");
            System.out.println("\n Student Name:"+name);
            System.out.println("\n Student Roll No.:"+rollNo);
            System.out.println("\n Academic Percentage:"+percentage+"%");

        }

        public void storeSportsDetails(){
            System.out.println("Enter the Sport Name:");
            sportName = sc.nextLine();

        }
        public void displaySportsDetails(){
            System.out.println("\n Sports Details:");
            System.out.println("Sport Name:"+sportName);
        }
}


public class StudentDemo {
    public static void main(String[] args)
    {
        student s = new student();
        s.storeAcademicDetails();
        s.storeSportsDetails();

        System.out.println("\n Combined student details:");
        s.displayAcademicDetails();
        s.displaySportsDetails();
    }
}
