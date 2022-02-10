package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public abstract class Display {

    public static List<String> Display (String[] args) {

        File inventoryFile = new File("vendingmachine.csv");
        List<String> list = new ArrayList<>();
        try (Scanner userInput = new Scanner(inventoryFile)) {
            while (userInput.hasNextLine()) {
                list.add(userInput.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return list;

    }


}