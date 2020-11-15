
package com.company;

import java.util.Random;

public class Pickaxe {
    protected int hp;

    public Pickaxe() {
        Random random = new Random();
        this.hp = random.nextInt(100);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}