package com.mander.p1edd.objects;

/**
 *
 * @author mander
 */
public class Gambler {
    
    private String gamblersName;
    private int gamblerScore;

    public Gambler(String gamblersName) {
        this.gamblersName = gamblersName;
    }

    public String getGamblersName() {
        return gamblersName;
    }

    public void setGamblersName(String gamblersName) {
        this.gamblersName = gamblersName;
    }

    public int getGamblerScore() {
        return gamblerScore;
    }

    public void setGamblerScore(int gamblerScore) {
        this.gamblerScore = gamblerScore;
    }
    
    
    
}
