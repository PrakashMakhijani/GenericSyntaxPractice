public class GenericClassExample {

    public static void main(String[] args) {
        Person<Employee> e1 = new Person<>();
        Person<Contact> c1 = new Person<>();

        Employee e = new Employee("John", "Steve", "123456");
        Contact c = new Contact("Prakash", "Makhijani", "23232", "233233233");


        e1.setPerson(e);
        c1.setPerson(c);
        System.out.println();

    }
}
