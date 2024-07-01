package finalexam.task3;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    public PaperFactory() {
    }

    public void addPerson(Person p) {
        staff.add(p);
    }

    public boolean deletePerson(Person p) {
        for (Person person : staff) {
            if (person.equals(p)) {
                staff.remove(person);
                return true;
            }
        }
        return false;
    }

    public List<Person> getStaff() {
        return staff;
    }

    public void setStaff(List<Person> staff) {
        this.staff = staff;
    }

    // Returns a list of all staff members with the given surname
    public List<Person> getStaffBySurname(String surname) {
        List<Person> result = new ArrayList<>();
        for (Person person : staff) {
            if (person.getSurname().equals(surname)) {
                result.add(person);
            }
        }
        return result;
    }

    // Method to save staff list to a file
    public void saveStaffToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Person person : staff) {
                writer.write(person.getName() + "," + person.getSurname() + "," + person.getPersonalNumber());
                writer.newLine();
            }
            System.out.println("Staff list saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving staff list: " + e.getMessage());
        }
    }

    // Method to load staff list from a file
    public void loadStaffFromFile(String filename) {
        staff.clear(); // Clear existing staff before loading
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    String surname = parts[1];
                    String personalNumber = parts[2];
                    staff.add(new Person(name, surname, personalNumber));
                }
            }
            System.out.println("Staff list loaded from " + filename);
        } catch (IOException e) {
            System.err.println("Error loading staff list: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaperFactory Staff:\n");
        for (Person person : staff) {
            sb.append(" - ").append(person).append("\n");
        }
        return sb.toString();
    }
}