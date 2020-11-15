package com.company;

import java.util.Random;

public class DurablePickaxe extends Pickaxe{

    public DurablePickaxe() {
        Random random = new Random();
        this.hp = random.nextInt(100) * 2;
    }

}