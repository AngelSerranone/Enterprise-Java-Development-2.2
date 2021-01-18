package com.ironhack.classes;

/** Subclass for exercise 6 */

public class Elf extends Player {
    // Constructor
    public Elf(String name, int health, int strength) {
        super(name, health, strength);
    }

    // Methods
    public void regeneration() {
        Boolean used = false;
        if (used == false) {
            setHealth(getHealth()+10);
            used = true;
        }
    }
}
