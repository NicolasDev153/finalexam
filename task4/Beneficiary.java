package finalexam.task4;

import java.util.ArrayList;
import java.util.List;

class Beneficiary {
    private String name;
    private String description;

    public Beneficiary(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Beneficiary {\n" +
                "    Name        : " + name + ",\n" +
                "    Description : " + description + "\n" +
                "}";
    }

}