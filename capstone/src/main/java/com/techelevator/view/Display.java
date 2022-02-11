package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public abstract class Display {

    static File inventoryFile = new File("vendingmachine.csv");

    public static List<String> readFile(String[] args) {


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

    public static Map<String, String> itemMap(String[] args) {
      //  String inventoryString = inventoryFile;
        Map<String, String> keyAndValueMap = new HashMap<>();

        try (Scanner scanner = new Scanner(inventoryFile)) {

            while (scanner.hasNextLine()) {
                String inventoryString = scanner.nextLine();
                String[] inputItems = inventoryString.split("\\|");
                keyAndValueMap.put(inputItems[0], inputItems[2]);
            }
        } catch(
        FileNotFoundException e)

        {
            e.getMessage();
        }
            return keyAndValueMap;
    }
}

