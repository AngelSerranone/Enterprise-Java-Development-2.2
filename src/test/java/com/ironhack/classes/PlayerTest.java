package com.ironhack.classes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Exercise 7: Employing TDD, create a method that decrements the lives of a player.
 * The method should reduce the number of lives by one and restore the player's health to its original state.
 */

class PlayerTest {
    private static Player player;

    @BeforeAll
    public static void setUp() {
        System.out.println("Setting up the Player class");
        player = new Player("Player 1", 150, 25);
    }

    @Test
    public void loseOneLife_withLives_OneLifeLess() {
        player.loseOneLife();
        assertEquals(2, player.getLives());
        player.loseOneLife();
        assertEquals(1, player.getLives());
    }
    public void loseOneLife_lastLife_heDied() {
        player.setLives(1);
        player.loseOneLife();
        assertEquals("You died", player.loseOneLife());
    }
    public void loseOneLife_zeroLife_heIsAlreadyDied() {
        player.setLives(0);
        player.loseOneLife();
        assertEquals("You are already died", player.loseOneLife());
    }
    public void loseOneLife_restoreLife_restored() {
        player.setLives(3);
        player.setHealth(5);
        player.loseOneLife();
        assertEquals(150, player.getHealth());
    }

    @Test
    public void attack_noDie_lessHealth() {
        Player warrior1 = new Warrior("Pedro", 200, 50);
        Player warrior2 = new Warrior("Pepe", 200, 30);
        assertEquals(150, warrior1.attack(warrior2));
    }
    public void attack_die_restHealthAndLessLife() {
        Player warrior1 = new Warrior("Pedro", 200, 50);
        Player warrior2 = new Warrior("Pepe", 40, 30);
        assertEquals(40, warrior1.attack(warrior2));
        assertEquals(2, warrior2.getLives());
    }
}