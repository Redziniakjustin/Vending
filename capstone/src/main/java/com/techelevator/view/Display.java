package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.*;


public abstract class Display {


    public static List<String> readFile(String[] args) {

        File inventoryFile = new File("vendingmachine.csv");
        List<String> list = new ArrayList<>();
        //  String[] display = {};

        try (Scanner userInput = new Scanner(inventoryFile)) {
            while (userInput.hasNextLine()) {
                list.add(userInput.nextLine());
//                System.out.println(display).subList(4,8));
//                System.out.println(display).subList(8,12));
//                System.out.println(display).subList(12,16));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return list;

    }

    public Map<String, String> itemMap = new HashMap<>() {
        File inventoryFile = new File("vendingmachine.csv");
        String inventoryString = inventoryFile.toString();
        String[] inputItems = inventoryString.split("//|");
            try(
        Scanner scanner = new Scanner(inventoryFile))

        {
            while (scanner.hasNextLine()) {
                itemMap.put(inputItems[0], inputItems[2]);
            }
        } catch(
        FileNotFoundException e)

        {
            e.printStackTrace();
        }
    }
}

