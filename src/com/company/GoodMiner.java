package com.company;

import java.util.Random;

public class GoodMiner extends Miner {

    private Pickaxe pickaxe;
    private int diamonds;

    @Override
    public String toString() {
        return "я хороший шахтер";
    }

    @Override
    public int kopat(Mine mine, int amount) {
        int took = 0;
        Random random = new Random();

        while(pickaxe.getHp() > 0 && amount > 0) {
            mine.setDiamonds(mine.getDiamonds()-1);
            pickaxe.setHp(pickaxe.getHp()-random.nextInt(5));
            took = took + 2;
            amount = amount -2;
            if (mine.getDiamonds() == 0){
                break;
            }
        }

        if(pickaxe.getHp()<=0) {
            pickaxe = getPickaxe();
        }

        diamonds += took;
        return took;
    }
}