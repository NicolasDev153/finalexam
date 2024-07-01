package finalexam.task3;

import java.nio.file.Paths;

public class FactoryTester {
    public static void main(String[] args) {
        // Get the path to the user's home directory
        String homeDir = System.getProperty("user.home");
        String filePath = Paths.get(homeDir, "staff.txt").toString();

        // Create a new PaperFactory
        PaperFactory factory = new PaperFactory();

        // Add some staff members
        factory.addPerson(new Person("John", "Doe", "123456"));
        factory.addPerson(new Person("Jane", "Smith", "789012"));
        factory.addPerson(new Person("Alice", "Johnson", "345678"));
        factory.addPerson(new Person("Bob", "Smith", "901234"));

        // Print the initial staff list
        System.out.println("Initial staff list:");
        System.out.println(factory);

        // Save the staff list to a file
        factory.saveStaffToFile(filePath);
        System.out.println("Staff list saved to: " + filePath);

        // Create a new PaperFactory and load the staff list from the file
        PaperFactory loadedFactory = new PaperFactory();
        loadedFactory.loadStaffFromFile(filePath);

        // Print the loaded staff list
        System.out.println("\nLoaded staff list:");
        System.out.println(loadedFactory);

        // Test getStaffBySurname method
        String testSurname = "Smith";
        System.out.println("\nStaff members with surname '" + testSurname + "':");
        for (Person person : loadedFactory.getStaffBySurname(testSurname)) {
            System.out.println(person);
        }

        // Test deletePerson method
        Person personToDelete = new Person("Jane", "Smith", "789012");
        boolean deleted = loadedFactory.deletePerson(personToDelete);
        System.out.println("\nDeleting " + personToDelete);
        System.out.println("Deletion " + (deleted ? "successful" : "failed"));

        // Print the final staff list
        System.out.println("\nFinal staff list after deletion:");
        System.out.println(loadedFactory);
    }
}