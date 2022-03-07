package com.mander.p1edd.criticalServices;

import com.mander.p1edd.objects.*;
import java.io.*;
import java.util.*;

public class Entry {

    private int tmpSteps;

    public void analyzeEntry(String fileName, NodeList<Bet> bets) {
        try (Scanner reader = new Scanner(fileName)) {
            while (reader.hasNextLine()) {
                String[] data = reader.nextLine().split(",");
                saveBets(data, bets);
            }
            System.out.println("File read successfully");
            bets.printData();
        } catch (Exception e) {
            System.out.println("Error while trying analyze Entry data: " + e);
        }
    }

    private void saveBets(String[] data, NodeList<Bet> bets) {
        try {
            Gambler gambler = new Gambler(data[0].trim());
            Double amount = Double.valueOf(data[1].trim());
            Horse[] horses = new Horse[data.length - 2];
            readHorses(horses, data, 0);
            bets.addAtHead(new Bet(gambler, horses, amount));
            tmpSteps++;
        } catch (Exception e) {
            System.out.println("Error while saving data " + e.getMessage());
        }
    }

    private void readHorses(Horse[] horses, String[] data, int horseTmp) {

        try {
            if (horseTmp != data.length - 2) {
            horses[horseTmp] = new Horse(data[horseTmp + 2].trim());
            horseTmp++;
            readHorses(horses, data, horseTmp);
        }
        } catch (Exception e) {
            System.out.println("Error while reading horeses " + e.getMessage());
        }

    }

}
