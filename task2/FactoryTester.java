package finalexam.task2;

public class FactoryTester {
    public static void main(String[] args) {

        Person person1 = new Person("John", "Doe", "123456789");
        Person person2 = new Person("Jane", "Doe", "987654321");
        Person person3 = new Person("Alice", "Smith", "456789123");
        Person person4 = new Person("Bob", "Smith", "789123456");

        PaperFactory paperFactory = new PaperFactory();
        paperFactory.addPerson(person1);
        paperFactory.addPerson(person2);
        paperFactory.addPerson(person3);
        paperFactory.addPerson(person4);

        System.out.println(paperFactory.getStaff());
        System.out.println(paperFactory.getStaffBySurname("Doe"));
        System.out.println(paperFactory.getStaffBySurname("Smith"));
        System.out.println(paperFactory);

        paperFactory.deletePerson(person2);
        System.out.println(paperFactory.getStaff());
    }
}
