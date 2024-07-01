package finalexam.task2;

import java.util.ArrayList;
import java.util.List;

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
