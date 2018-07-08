package model;

import java.util.Random;

public class Paladin extends Person implements Warrior {

    private int health;
    private final int attack;
    private final int cost;
    private final int minAttack;

    private final Random random;

    public Paladin(String name) {
        super(name);
        this.health = 200;
        this.attack = 100;
        this.cost = 60000;
        this.minAttack = 0;
        this.random = new Random();
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getCost() {
        return cost;
    }

    public int getMinAttack() {
        return minAttack;
    }

    @Override
    public int attack() {
        return random.nextInt(attack + 1);
    }

    @Override
    public int defend(int damage) {
        health -= damage;
        return health;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                ", attack=" + attack +
                ", cost=" + cost +
                ", minAttack=" + minAttack +
                '}';
    }
}