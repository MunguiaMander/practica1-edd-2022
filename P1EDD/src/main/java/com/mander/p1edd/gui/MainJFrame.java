/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mander.p1edd.gui;

import com.mander.p1edd.criticalServices.Entry;
import com.mander.p1edd.criticalServices.Scores;
import com.mander.p1edd.criticalServices.Verify;
import com.mander.p1edd.managers.*;
import com.mander.p1edd.objects.*;

/**
 *
 * @author mander
 */
public class MainJFrame extends javax.swing.JFrame {

    //Initialize Objects
    Verify verify = new Verify();
    Scores scores = new Scores();
    Entry entry = new Entry();
    DataManager dataManager = new DataManager();
    PodiumManager podiumManager = new PodiumManager();
    ScoresManager scoresManager = new ScoresManager();
    Node<Bet> bet = new Node<Bet>();
    NodeList<Bet> bets = new NodeList<>();
    Horse[] horsePodium = new Horse[10];

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.setTitle("Hippodrome Races & Bets");
        this.setLocationRelativeTo(null);
        podiumManager.initLists(horseList, horsePodiumList);
        dataManager.setBetsText(uploadBetsButton, betsJTextArea);
        dataManager.sendBets(sendBetsButton, entry, bets, bet, betsJTextArea, podiumManager, horseList, verify);
        podiumManager.addHorseList(bet, bets, horseList, sendBetsButton);
        podiumManager.addHorsePodiumList(horseList, horsePodiumList, setHorsePodiumButton);
        podiumManager.sendHorsePodium(horsePodium, horsePodiumList, sendPodiumButton);
        scoresManager.sendScores(horsePodium, sendScoresButton, scores, bet, bets);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        betsEntryJPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        betsJTextArea = new javax.swing.JTextArea();
        sendBetsButton = new javax.swing.JButton();
        uploadBetsButton = new javax.swing.JButton();
        clearBetsButton = new javax.swing.JButton();
        podiumEntryJPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        horseList = new javax.swing.JList<>();
        sendPodiumButton = new javax.swing.JButton();
        currentHorsesJLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        horsePodiumList = new javax.swing.JList<>();
        setHorsePodiumButton = new javax.swing.JButton();
        sendScoresButton = new javax.swing.JButton();
        reportsJPanel = new javax.swing.JPanel();
        cricalServiceJLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        verifyServiceTextArea = new javax.swing.JTextArea();
        cricalServiceJLabel3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        scoresServiceTextArea = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        orderingServiceTextArea = new javax.swing.JTextArea();
        cricalServiceJLabel4 = new javax.swing.JLabel();
        cricalServiceJLabel5 = new javax.swing.JLabel();
        cricalServiceJLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultsBetsJTextArea = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        errorsJTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        betsJTextArea.setColumns(20);
        betsJTextArea.setRows(5);
        betsJTextArea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(betsJTextArea);

        sendBetsButton.setText("Send Bets");
        sendBetsButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        uploadBetsButton.setText("Upload Bets");
        uploadBetsButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        clearBetsButton.setText("Clear Bets");
        clearBetsButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout betsEntryJPanelLayout = new javax.swing.GroupLayout(betsEntryJPanel);
        betsEntryJPanel.setLayout(betsEntryJPanelLayout);
        betsEntryJPanelLayout.setHorizontalGroup(
            betsEntryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(betsEntryJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(betsEntryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(betsEntryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(uploadBetsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearBetsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sendBetsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        betsEntryJPanelLayout.setVerticalGroup(
            betsEntryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(betsEntryJPanelLayout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addComponent(uploadBetsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearBetsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendBetsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, betsEntryJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bets Entry", betsEntryJPanel);

        horseList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        horseList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        horseList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        horseList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(horseList);

        sendPodiumButton.setText("Send Podium");
        sendPodiumButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        currentHorsesJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentHorsesJLabel.setText("Current Horses");

        horsePodiumList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        horsePodiumList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(horsePodiumList);

        setHorsePodiumButton.setText("Set Horse in Podium");
        setHorsePodiumButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sendScoresButton.setText("Send Scores");
        sendScoresButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout podiumEntryJPanelLayout = new javax.swing.GroupLayout(podiumEntryJPanel);
        podiumEntryJPanel.setLayout(podiumEntryJPanelLayout);
        podiumEntryJPanelLayout.setHorizontalGroup(
            podiumEntryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(podiumEntryJPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(podiumEntryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(podiumEntryJPanelLayout.createSequentialGroup()
                        .addComponent(currentHorsesJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(setHorsePodiumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(podiumEntryJPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(podiumEntryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(podiumEntryJPanelLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(podiumEntryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sendPodiumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sendScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        podiumEntryJPanelLayout.setVerticalGroup(
            podiumEntryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(podiumEntryJPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(podiumEntryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentHorsesJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setHorsePodiumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(podiumEntryJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(podiumEntryJPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(sendPodiumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sendScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane1.addTab("Podium Entry", podiumEntryJPanel);

        cricalServiceJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cricalServiceJLabel2.setText("Not Accepted Bets");

        verifyServiceTextArea.setEditable(false);
        verifyServiceTextArea.setColumns(20);
        verifyServiceTextArea.setRows(5);
        jScrollPane6.setViewportView(verifyServiceTextArea);

        cricalServiceJLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cricalServiceJLabel3.setText("Scores");

        scoresServiceTextArea.setEditable(false);
        scoresServiceTextArea.setColumns(20);
        scoresServiceTextArea.setRows(5);
        jScrollPane7.setViewportView(scoresServiceTextArea);

        orderingServiceTextArea.setEditable(false);
        orderingServiceTextArea.setColumns(20);
        orderingServiceTextArea.setRows(5);
        jScrollPane8.setViewportView(orderingServiceTextArea);

        cricalServiceJLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cricalServiceJLabel4.setText("Ordering Service");

        cricalServiceJLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cricalServiceJLabel5.setText("Verify Service");

        cricalServiceJLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cricalServiceJLabel6.setText("All Places and Accepted Bets");

        resultsBetsJTextArea.setEditable(false);
        resultsBetsJTextArea.setColumns(20);
        resultsBetsJTextArea.setRows(5);
        jScrollPane3.setViewportView(resultsBetsJTextArea);

        errorsJTextArea.setEditable(false);
        errorsJTextArea.setColumns(20);
        errorsJTextArea.setRows(5);
        jScrollPane5.setViewportView(errorsJTextArea);

        javax.swing.GroupLayout reportsJPanelLayout = new javax.swing.GroupLayout(reportsJPanel);
        reportsJPanel.setLayout(reportsJPanelLayout);
        reportsJPanelLayout.setHorizontalGroup(
            reportsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(reportsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportsJPanelLayout.createSequentialGroup()
                        .addGroup(reportsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cricalServiceJLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(reportsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cricalServiceJLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cricalServiceJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cricalServiceJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(reportsJPanelLayout.createSequentialGroup()
                        .addGroup(reportsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cricalServiceJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        reportsJPanelLayout.setVerticalGroup(
            reportsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(reportsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportsJPanelLayout.createSequentialGroup()
                        .addComponent(cricalServiceJLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reportsJPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cricalServiceJLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cricalServiceJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cricalServiceJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(reportsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportsJPanelLayout.createSequentialGroup()
                        .addComponent(cricalServiceJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Reports", reportsJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("jTabbedPanel");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel betsEntryJPanel;
    private javax.swing.JTextArea betsJTextArea;
    private javax.swing.JButton clearBetsButton;
    private javax.swing.JLabel cricalServiceJLabel2;
    private javax.swing.JLabel cricalServiceJLabel3;
    private javax.swing.JLabel cricalServiceJLabel4;
    private javax.swing.JLabel cricalServiceJLabel5;
    private javax.swing.JLabel cricalServiceJLabel6;
    private javax.swing.JLabel currentHorsesJLabel;
    private javax.swing.JTextArea errorsJTextArea;
    private javax.swing.JList<String> horseList;
    private javax.swing.JList<String> horsePodiumList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea orderingServiceTextArea;
    private javax.swing.JPanel podiumEntryJPanel;
    private javax.swing.JPanel reportsJPanel;
    private javax.swing.JTextArea resultsBetsJTextArea;
    private javax.swing.JTextArea scoresServiceTextArea;
    private javax.swing.JButton sendBetsButton;
    private javax.swing.JButton sendPodiumButton;
    private javax.swing.JButton sendScoresButton;
    private javax.swing.JButton setHorsePodiumButton;
    private javax.swing.JButton uploadBetsButton;
    private javax.swing.JTextArea verifyServiceTextArea;
    // End of variables declaration//GEN-END:variables
}
