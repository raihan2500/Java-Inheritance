package E913;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Bulbul", 200);
        System.out.println(employee);

        Manager manager = new Manager("Shamim", 400, "Time pass");
        System.out.println(manager);

        Executive executive = new Executive("Ope", 600, "Mara khawa");
        System.out.println(executive);
    }

}
