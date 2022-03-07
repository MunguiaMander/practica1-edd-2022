package com.mander.p1edd.criticalServices;

import com.mander.p1edd.objects.*;

public class Ordering {

    public void orderingResults(Node<Bet> bet, NodeList<Bet> bets) {
        if ((bet != null)) {
            if ((bet != null) && (bet.getData().isValid())) {
                if (bet.getData().getGambler().getGamblerScore() > bets.getHead().getData().getGambler().getGamblerScore()) {
                    Bet tmp = bet.getData();
                    bets.addAtHead(tmp);
                    bet = bet.getNext();
                    orderingResults(bet, bets);
                } else {
                }

            }
        } else {

        }
    }
}
