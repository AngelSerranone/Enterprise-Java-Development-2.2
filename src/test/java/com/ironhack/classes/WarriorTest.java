package com.ironhack.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    void transformToElf() {
        Warrior warrior1= new Warrior ("Pepe",150, 50);
        Elf elf1 = new Elf ("Paco", 100, 20);
        assertEquals(elf1.getClass(), warrior1.transformToElf().getClass());
    }
}