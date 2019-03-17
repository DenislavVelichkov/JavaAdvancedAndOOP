package JavaOOP.InterfacesAndAbstraction_9.Exercise.MillitaryElite_6.models;

import JavaOOP.InterfacesAndAbstraction_9.Exercise.MillitaryElite_6.enumerations.Corp;
import JavaOOP.InterfacesAndAbstraction_9.Exercise.MillitaryElite_6.interfaces.SpecialisedSoldier;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corp corps;
    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corp corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }


    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + "Corps: " + this.corps.toString();
    }
}