package com.company;

public class Warrior extends Hero {
    public Warrior(int personagesHp, int damage, String typeOfSuperAbility) {
        super(personagesHp, damage, typeOfSuperAbility);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Warrior used a super ability: " + getTypeOfSuperAbility();
    }
}
