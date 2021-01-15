package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(22, 13, "Boost");
        Medic medic = new Medic(12,10,"Curing");
        Warrior warrior = new Warrior(10,15,"Critical damage");


        Hero heroes [] = {magic,medic,warrior};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].applySuperAbility(""));

        }

    }
}
