package E913;

public class Manager extends Employee{
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Manager's name: " + getName() + "\n" +
                "Department: " + department + "\n" +
                "Salary: " + getSalary() + "\n";
    }
}
