package com.company;

public class Medic extends Hero{
    public Medic(int personagesHp, int damage, String typeOfSuperAbility) {
        super(personagesHp, damage, typeOfSuperAbility);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Medic used super ability: " + getTypeOfSuperAbility();
    }
}
