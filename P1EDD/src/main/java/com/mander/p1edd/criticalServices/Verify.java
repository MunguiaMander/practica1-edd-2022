package com.mander.p1edd.criticalServices;

import com.mander.p1edd.objects.*;

public class Verify {

    private int steps;
    int tmpListSize = 0;
    private boolean tmp = true;

    // Ignore this comment, but my friend mayoneso push me to de void everytime we
    // play fall guys :c

    public void verifyBets(Node<Bet> bet, NodeList<Bet> bets, int actualHorse, int tmpHorse) {
        if (bet != null) {
            verifyBet(bet, bets, actualHorse, tmpHorse);
            bet = bet.getNext();
            tmp = true;
            verifyBets(bet, bets, actualHorse, tmpHorse);
        } else {
            
        }

    }

    public void verifyBet(Node<Bet> bet, NodeList<Bet> bets, int actualHorse, int tmpHorse) {
        if ((actualHorse < bet.getData().getGamblersBet().length) && (tmp == true)) {
            verifyHorses(bet, bets, actualHorse, tmpHorse);
            actualHorse = actualHorse + 1;
            tmpHorse = actualHorse + 1;
            verifyBet(bet, bets, actualHorse, tmpHorse);
            steps++;
        }
    }

    public void verifyHorses(Node<Bet> bet, NodeList<Bet> bets, int actualHorse, int tmpHorse) {
        if ((tmpHorse < bet.getData().getGamblersBet().length) && (tmp == true)) {
            if (bet.getData().getGamblersBet()[actualHorse].getHorseName()
                    .equals(bet.getData().getGamblersBet()[tmpHorse].getHorseName())) {
                bet.getData().setValid(false);
                tmp = false;
            } else {
                tmpHorse++;
                bet.getData().setValid(true);
                verifyHorses(bet, bets, actualHorse, tmpHorse);
            }
        }

    }

}
