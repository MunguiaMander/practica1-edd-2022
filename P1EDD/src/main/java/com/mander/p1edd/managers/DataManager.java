package com.mander.p1edd.managers;

import com.mander.p1edd.criticalServices.Entry;
import com.mander.p1edd.criticalServices.Verify;
import com.mander.p1edd.objects.Bet;
import com.mander.p1edd.objects.Node;
import com.mander.p1edd.objects.NodeList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author mander
 */
public class DataManager {

    public void setBetsText(JButton uploadBetsButton, JTextArea betsJTextArea) {

        uploadBetsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                JFileChooser chooseData = new JFileChooser();
                chooseData.showOpenDialog(null);
                File data = chooseData.getSelectedFile();
                try {
                    FileReader readData = new FileReader(data);
                    BufferedReader br = new BufferedReader(readData);
                    String text = "";
                    String line = "";
                    while ((line = br.readLine()) != null) {
                        text += line + "\n";
                    }
                    betsJTextArea.setText(text);
                    JOptionPane.showMessageDialog(null, "The file has been read");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error while tryng read the file");
                }

            }
        });
    }

    public void sendBets(JButton sendBetsButton, Entry entry, NodeList<Bet> bets, Node<Bet> bet, JTextArea betsJTextArea, PodiumManager podiumManager, JList horseList, Verify verify) {
        sendBetsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                try {
                    entry.analyzeEntry(betsJTextArea.getText(), bets);
                    podiumManager.addHorseList(bet, bets, horseList, sendBetsButton);
                    verifyBets(verify, bet, bets);
                    JOptionPane.showMessageDialog(null, "The bets has been sent");
                    bets.printData();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error while trying to send bets");

                }

            }
        });
    }

    public void verifyBets(Verify verify, Node<Bet> bet, NodeList<Bet> bets) {

        try {
            bet = bets.getTail();
            verify.verifyBets(bet, bets, 0, 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error while trying to verify bets");
        }
    }

}
