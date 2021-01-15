package com.company;

public class Magic extends Hero{
    public Magic(int personagesHp, int damage, String typeOfSuperAbility) {
        super(personagesHp, damage, typeOfSuperAbility);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return  "Magic used a super ability: " + getTypeOfSuperAbility();
    }
}
