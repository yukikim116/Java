package com.company;

import java.util.Random;

public class Miner {
    private Pickaxe pickaxe;
    private int diamonds;

    public Miner() {
        pickaxe = new Pickaxe();
        diamonds = 0;
    }

    @Override
    public String toString(){
        return "я шахтер";
    }


    public int getDiamonds() {
        return diamonds;
    }

    public Pickaxe getDurablePickaxe(){
        return new DurablePickaxe();
    }
    public Pickaxe getPickaxe() {return new Pickaxe();}


    public int kopat(Mine mine, int amount){
        try {
            if (amount <= 0) throw new IllegalArgumentException("wrong amount");
        } catch (Exception ex) {

        }

        int took = 0;
        Random random = new Random();

        while(pickaxe.getHp() > 0 && amount > 0) {
            mine.setDiamonds(mine.getDiamonds()-1);
            pickaxe.setHp(pickaxe.getHp()-random.nextInt(5));
            took++;
            amount--;
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