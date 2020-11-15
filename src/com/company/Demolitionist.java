package com.company;

import java.util.Random;

public class Demolitionist extends Miner {

    private int diamonds;
    @Override
    public String toString(){
        return "я подрывник";
    }

    public int blow(Mine mine){
        int took;
        Random random = new Random();
        int explode = random.nextInt(6);
        if(mine.getDiamonds() >= explode) {
            mine.setDiamonds(mine.getDiamonds()-explode);
            took = explode;
        } else {
            took = mine.getDiamonds();
            mine.setDiamonds(0);
        }
        diamonds += took;
        return took;
    }
}
