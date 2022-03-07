package com.mander.p1edd.criticalServices;

import com.mander.p1edd.objects.*;

public class Scores {

    public void giveScores(Node<Bet> bet, NodeList<Bet> bets, Horse[] horsePodium) {
        if ((bet != null)) {
            if ((bet != null) && (bet.getData().isValid())) {
                giveScore(bet, bets, horsePodium);
                bet = bet.getNext();
                giveScores(bet, bets, horsePodium);
            } else {
                bet = bet.getNext();
                giveScores(bet, bets, horsePodium);
            }
        } else {

        }
        
    }

    public void giveScore(Node<Bet> bet, NodeList<Bet> bets, Horse[] horsePodium) {

        for (int i = 0; i < bet.getData().getGamblersBet().length; i++) {
            int points = verifyPodium(bet, bets, horsePodium, i, 10);
            bet.getData().getGambler().setGamblerScore(bet.getData().getGambler().getGamblerScore() + points);
            
        }

    }

    public int verifyPodium(Node<Bet> bet, NodeList<Bet> bets, Horse[] horsePodium, int i, int points) {

        if (bet.getData().getGamblersBet()[i].getHorseName().equals(horsePodium[i].getHorseName())) {
            return determinateScore(i);

        } else {

            return 0;

        }

    }

    public int determinateScore(int i) {

        switch (i) {
            case 0:
                return 10;
            case 1:
                return 9;
            case 2:
                return 8;
            case 3:
                return 7;
            case 4:
                return 6;
            case 5:
                return 5;
            case 6:
                return 4;
            case 7:
                return 3;
            case 8:
                return 2;
            case 9:
                return 1;
            default:
                break;
        }
        return 0;
    }

}
