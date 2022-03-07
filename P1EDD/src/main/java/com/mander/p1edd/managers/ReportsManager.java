/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mander.p1edd.managers;

import com.mander.p1edd.criticalServices.Ordering;
import com.mander.p1edd.criticalServices.Scores;
import com.mander.p1edd.objects.Bet;
import com.mander.p1edd.objects.Horse;
import com.mander.p1edd.objects.Node;
import com.mander.p1edd.objects.NodeList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author mander
 */
public class ReportsManager {

    public void setReults(JTextArea resultsJTextArea, Node<Bet> bet, NodeList<Bet> bets, Ordering ordering, JButton sendScoresButton) {
        sendScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                try {
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error while trying to give scores");

                }

            }

        });
    }

    public void setErrors() {

    }

    public void setBetInfo(JTextArea resultsJTextArea, Node<Bet> bet, NodeList<Bet> bets, Ordering ordering) {

        try {
            
            sendNode(bet,bets,ordering);
            resultsJTextArea.setText(bets.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error while trying to give scores");

        }

    }

    public void sendNode(Node<Bet> bet, NodeList<Bet> bets, Ordering ordering) {
        
        bet = bets.getTail();
        ordering.orderingResults(bet, bets);
        bets.printData();
    }

}
