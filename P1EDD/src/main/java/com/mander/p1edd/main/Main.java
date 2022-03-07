package com.mander.p1edd.main;

import com.mander.p1edd.criticalServices.*;
import com.mander.p1edd.gui.MainJFrame;
import com.mander.p1edd.objects.*;

/**
 *
 * @author mander
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Verify verify = new Verify();
//        Scores scores = new Scores();
//        Entry entry = new Entry();
//        NodeList<Bet> bets = new NodeList<>();
//        String fileName = "src/main/Resources/poquis.csv";
//        Horse[] horsePodium = new Horse[]{new Horse("1"), new Horse("2"), new Horse("3"), new Horse("4"),
//            new Horse("5"), new Horse("6"), new Horse("7"), new Horse("8"), new Horse("9"), new Horse("10")};
//        entry.analyzeEntry(fileName, bets);
//        Node<Bet> bet = bets.getTail();
//        verify.verifyBets(bet, bets, 0, 1);
//        bets.printData();
//        scores.giveScores(bet, bets, horsePodium);
//        // verify.verifyBets();
//        // scores.giveScore();

            MainJFrame runHippodromeRaces =  new MainJFrame();
            runHippodromeRaces.setVisible(true);

       }

}
