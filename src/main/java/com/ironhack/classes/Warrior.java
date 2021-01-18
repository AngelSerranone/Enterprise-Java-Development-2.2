package com.ironhack.classes;

import com.google.gson.Gson;

/** Subclass for exercise 6 */

public class Warrior extends Player {
    //Constructor
    public Warrior(String name, int health, int strength) {
        super(name, health, strength);
    }

    // Methods

    // Fury
    public void fury() {
        Boolean used = false;
        if (used == false) {
            setStrength(getStrength()+5);
            used = true;
        }
    }

    /** Exercise 9: Employing TDD, create a transformToElf method that changes a Warrior or Wizard to an Elf.
     * All the players stats should remain intact during the transformation. Hint: Your test should
     * test to ensure that the new object has all the same stats and is of type Elf. You will likely
     * need to use Google to determine how to accomplish this. */
    // Convert to Elf
    public Elf transformToElf(){
        Gson gson = new Gson();
        String jsonString = gson.toJson(this);
        Elf newElf = gson.fromJson(jsonString, Elf.class);
        return newElf;
    }
}
