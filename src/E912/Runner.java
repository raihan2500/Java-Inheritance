package E912;

public class Runner {
    public static void main(String[] args) {
        Person person = new Person("Raihan Ahmed", 2003);
        System.out.println(person);

        Student student = new Student("Raihan Ahmed", 2003, "Omor Faruk Sir");
        System.out.println(student);

        Instructor instructor = new Instructor("Omar Faruk", 1982, 60000);
        System.out.println(instructor);
    }
}
