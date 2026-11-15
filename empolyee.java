import java.util.*;

class EMP {
    int id;
    String name;
    String department;

    EMP(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return id + " " + name + " " + department;
    }
}

public class empolyee {
    public static void main(String[] args) {

        ArrayList<EMP> list = new ArrayList<>();

        list.add(new EMP(101, "Amit", "IT"));
        list.add(new EMP(102, "Siya", "HR"));
        list.add(new EMP(103, "Rahul", "Sales"));

        System.out.println("Employee using ArrayList:");

        Iterator<EMP> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        HashSet<String> department = new HashSet<>();

        department.add("IT");
        department.add("HR");
        department.add("Sales");

        System.out.println("\nDepartments using HashSet:");

        for (String dept : department) {
            System.out.println(dept);
        }

        HashMap<Integer, EMP> map = new HashMap<>();

        for (EMP e : list) {
            map.put(e.id, e);
        }

        System.out.println("\nEmployee retrieved using HashMap:");
        System.out.println(map.get(102));

        EMP emp = new EMP(104, "Sneha", "Finance");

        list.add(emp);
        map.put(emp.id, emp);

        System.out.println("\nEmployee count: " + list.size());

        System.out.println("Employee with ID 104: " + map.get(104));
    }
}