package finalexam.task4;

import java.util.ArrayList;
import java.util.List;
public class CharityOrganization implements LegalEntity {
    private String name;
    private String address;
    private String vatNumber;
    private List<Beneficiary> beneficiaries;

    public CharityOrganization(String name, String address, String vatNumber) {
        this.name = name;
        this.address = address;
        this.vatNumber = vatNumber;
        this.beneficiaries = new ArrayList<>();
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public String getName() {
        return name;
    }

    public void addBeneficiary(Beneficiary beneficiary) {
        beneficiaries.add(beneficiary);
    }

    public void removeBeneficiary(Beneficiary beneficiary) {
        beneficiaries.remove(beneficiary);
    }

    public List<Beneficiary> getBeneficiaries() {
        return new ArrayList<>(beneficiaries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CharityOrganization {\n");
        sb.append("    Name          : ").append(name).append(",\n");
        sb.append("    Address       : ").append(address).append(",\n");
        sb.append("    VAT Number    : ").append(vatNumber).append(",\n");
        sb.append("    Beneficiaries : \n");

        for (Beneficiary beneficiary : beneficiaries) {
            sb.append("        ").append(beneficiary).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}