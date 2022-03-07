/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mander.p1edd.managers;

import com.mander.p1edd.criticalServices.Scores;
import com.mander.p1edd.criticalServices.Verify;
import com.mander.p1edd.objects.Bet;
import com.mander.p1edd.objects.Horse;
import com.mander.p1edd.objects.Node;
import com.mander.p1edd.objects.NodeList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

//                try{
//                }catch(Exception e){
//          JOptionPane.showMessageDialog(null, "The file has been read");      
//            }
/**
 *
 * @author mander
 */
public class ScoresManager {

    public void sendScores(Horse[] horsePodium, JButton sendScoresButton, Scores scores, Node<Bet> bet, NodeList<Bet> bets) {

        sendScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                try {
                    sendNode(bet, bets, horsePodium, scores);
                    JOptionPane.showMessageDialog(null, "The Scores has been updated");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error while trying to give scores");

                }

            }

        });
    }

    public void sendNode(Node<Bet> bet, NodeList<Bet> bets, Horse[] horsePodium, Scores scores) {
        bet = bets.getTail();
        scores.giveScores(bet, bets, horsePodium);
        bets.printData();
    }

}
