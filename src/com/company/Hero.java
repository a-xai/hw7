package com.company;

public abstract class Hero implements HavingSuperAbility{
    private int personagesHp;
    private int damage;
    private String typeOfSuperAbility;

    public int getPersonagesHp() {
        return personagesHp;
    }

    public void setPersonagesHp(int personagesHp) {
        this.personagesHp = personagesHp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfSuperAbility() {
        return typeOfSuperAbility;
    }

    public void setTypeOfSuperAbility(String typeOfSuperAbility) {
        this.typeOfSuperAbility = typeOfSuperAbility;
    }

    public Hero(int personagesHp, int damage, String typeOfSuperAbility) {
        this.personagesHp = personagesHp;
        this.damage = damage;
        this.typeOfSuperAbility = typeOfSuperAbility;
    }
}
