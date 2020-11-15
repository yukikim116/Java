package com.company;

import java.util.Random;

public class Mine {
    private int diamonds;

    public Mine() {
        Random random = new Random();
        this.diamonds = random.nextInt(100);
    }

    public int getDiamonds() {
        return diamonds;
    }

    public void setDiamonds(int diamonds) {
        this.diamonds = diamonds;
    }
}