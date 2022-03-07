package com.mander.p1edd.managers;

import com.mander.p1edd.criticalServices.Scores;
import com.mander.p1edd.objects.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author mander
 */
public class PodiumManager {

    public void initLists(JList horseList, JList horsePodiumList) {
        DefaultListModel defaultModel = new DefaultListModel();
        horseList.setModel(defaultModel);
        horsePodiumList.setModel(defaultModel);
    }

    public void addHorseList(Node<Bet> bet, NodeList<Bet> bets, JList horseList, JButton sendBetsButton) {

        try {
            DefaultListModel defaultModel = new DefaultListModel();
            bet = bets.getTail();
            for (int i = 0; i < bet.getData().getGamblersBet().length; i++) {
                defaultModel.addElement(bet.getData().getGamblersBet()[i].getHorseName());
            }
            horseList.setModel(defaultModel);
        } catch (Exception e) {

        }

    }

    public void addHorsePodiumList(JList horseList, JList horsePodiumList, JButton setHorsePodiumButton) {

        DefaultListModel defaultModel = new DefaultListModel();
        setHorsePodiumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                defaultModel.addElement(horseList.getSelectedValue());
                horsePodiumList.setModel(defaultModel);

            }

        });

    }

    public void sendHorsePodium(Horse[] horsePodium, JList horsePodiumList, JButton sendPodiumButton) {

        sendPodiumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                try {
                    for (int i = 0; i < horsePodiumList.getModel().getSize(); i++) {
                        Horse horseTmp = new Horse((String) horsePodiumList.getModel().getElementAt(i));
                        horsePodium[i] = horseTmp;
                    }
                    System.out.println(Arrays.toString(horsePodium));
                    JOptionPane.showMessageDialog(null, "The podium has been set");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error while trying to set podium");
                }

            }

        });

    }

}
