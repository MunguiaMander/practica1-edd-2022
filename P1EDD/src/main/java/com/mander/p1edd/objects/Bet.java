package com.mander.p1edd.objects;

import java.util.*;

public class Bet {

    private Gambler gambler;
    private Horse[] gamblersBet;
    private Double betAmount;
    private boolean isValid = false;

    public Bet(Gambler gambler, Horse[] gamblersBet, Double betAmount) {
        this.gambler = gambler;
        this.gamblersBet = gamblersBet;
        this.betAmount = betAmount;
    }

    public Gambler getGambler() {
        return gambler;
    }

    public void setGambler(Gambler gambler) {
        this.gambler = gambler;
    }

    public Horse[] getGamblersBet() {
        return gamblersBet;
    }

    public void setGamblersBet(Horse[] gamblersBet) {
        this.gamblersBet = gamblersBet;
    }

    public Double getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(Double betAmount) {
        this.betAmount = betAmount;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Bet{" + "gambler=" + gambler.getGamblersName() + ", gamblersBet=" + Arrays.toString(gamblersBet) + ", betAmount=" + betAmount + ", State=" + isValid + ", Score " + gambler.getGamblerScore() + '}';
    }

}
