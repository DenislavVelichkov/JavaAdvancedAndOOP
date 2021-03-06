package JavaOOP.InterfacesAndAbstraction_9.Exercise.MillitaryElite_6.models;

import JavaOOP.InterfacesAndAbstraction_9.Exercise.MillitaryElite_6.enumerations.Corp;
import JavaOOP.InterfacesAndAbstraction_9.Exercise.MillitaryElite_6.interfaces.Engineer;
import JavaOOP.InterfacesAndAbstraction_9.Exercise.MillitaryElite_6.interfaces.Repair;

import java.util.ArrayList;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corp corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
                sb.append(System.lineSeparator()).append("Repairs:");

        this.repairs.forEach(repair -> {
            sb.append(System.lineSeparator());
            sb.append("  ").append(repair.toString());
        });

        return sb.toString();
    }
}
