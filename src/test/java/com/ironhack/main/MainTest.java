package com.ironhack.main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private static Main main;

    @BeforeAll
    public static void setUp() {
        main = new Main();
    }

    @Test
    public static void checkKeyWordsInString_withKeyWord_true() {
        String phrase = "Break dance my friend";
        assertEquals(true, main.checkKeyWordsInString(phrase));
    }
}