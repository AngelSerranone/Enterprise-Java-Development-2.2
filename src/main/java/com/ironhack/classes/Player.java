package com.ironhack.classes;

/** Exercise 6: Create a Player class for a video game. Track the players stats
 * (health, strength, lives, etc). Create 3 subclasses Warrior, Elf, Wizard.
 * Provide at least one specialized behavior for each. */

public class Player {
    // Properties
    private String name;
    private int health;
    private int strength;
    private int lives;

    // Constructor
    public Player(String name, int health, int strength) {
        setName(name);
        setHealth(health);
        setStrength(strength);
        setLives(3);
    }

    // Methods

    /** Exercise 8: Employing TDD, create a method that allows one player to attack another.
     * When a player attacks another the attecked players health should decrease by the attacking
     * players strength. For example, if playerA has strength = 5 and playerB has health = 20, then
     * when playerA attacks playerB, playerB's new health will be 15. Hint: the attack method will take
     * a Player object as an argument */
    // Attack
    public int attack (Player player){
        int attackValue = getStrength();
        player.setHealth(player.getHealth()-attackValue);
        player.checkHealth();
        return player.getHealth();
    }

    /** Exercise 7: Employing TDD, create a method that decrements the lives of a player.
     * The method should reduce the number of lives by one and restore the player's health to its original state. */
    // Lose one life
    public String loseOneLife() {
        String message = "";
        if (getLives()>0) {
            setLives(getLives()-1);
            setHealth(health);
            message = "You lost one life";
            if (getLives()==0){
                message = "You died";
            }
        } else {
            message = "You are already died";
        }
        return message;
    }

    /** Exercise 10: Employing TDD, create a checkHealth method.
     * If the player's health is at or below zero, the method should
     * call the method that decrements lives. checkHealth should be called each time a player is attacked. */
    // check health
    public void checkHealth(){
        int lifeStatus = getHealth();
        if (lifeStatus <= 0){
            this.loseOneLife();
        }
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
