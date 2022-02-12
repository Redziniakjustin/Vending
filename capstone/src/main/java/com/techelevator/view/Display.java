package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public class Display {

    static File inventoryFile = new File("vendingmachine.csv");
    public static List <String> slotList = new ArrayList<>();
    public static List<String> nameList = new ArrayList<>();
    public static List<BigDecimal> priceList = new ArrayList<>();
    public static List<String> typeList = new ArrayList<>();
    public static Map<String, Item> keyAndValueMap = new HashMap<>();
    public static List<String> readFile(String[] args) {

        // DISPLAY MENU
        List<String> list = new ArrayList<>();
        //  String[] display = {};
        try (Scanner userInput = new Scanner(inventoryFile)) {
            while (userInput.hasNextLine()) {
                list.add(userInput.nextLine());}
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return list;}

/*public static List organizedLists(){
    try (Scanner scanner = new Scanner(inventoryFile)) {
        while (scanner.hasNextLine()) {
            String inventoryString = scanner.nextLine();
            String[] inputItems = inventoryString.split("\\|");
            slotList.add(inputItems[0]);
            nameList.add(inputItems[1]);
            priceList.add(BigDecimal.valueOf(Double.parseDouble(inputItems[2])));
            typeList.add(inputItems[3]); }
    } catch(FileNotFoundException e)
    {e.getMessage();}
    return null;
}*/

    public static Map<String, Item> itemMap(String[] args) {
      //  String inventoryString = inventoryFile;
      //  keyAndValueMap = new HashMap<String, Item>();
        try (Scanner scanner = new Scanner(inventoryFile)) {
            while (scanner.hasNextLine()) {
                String inventoryString = scanner.nextLine();
               String[] inputItems = inventoryString.split("\\|");
               slotList.add(inputItems[0]);
               nameList.add(inputItems[1]);
               priceList.add(BigDecimal.valueOf(Double.parseDouble(inputItems[2])));
               typeList.add(inputItems[3]);
                   // keyAndValueMap.put(inputItems[0], inputItems[2]);
//                if (inputItems[3].equals("Drink")){
//                    keyAndValueMap.put(inputItems[0], new Beverages(inputItems[1], BigDecimal.valueOf(Double.parseDouble(inputItems[2])),inputItems[3],5));
//                    System.out.println(keyAndValueMap.get(inputItems[0]);
//                }
//                else if (inputItems[3].equals("Chip")){
//                    keyAndValueMap.put(inputItems[0], new Chips(inputItems[1], BigDecimal.valueOf(Double.parseDouble(inputItems[2])),inputItems[3], 5));
//                }
//                else if (inputItems[3].equals("Candy")){
//                    keyAndValueMap.put(inputItems[0], new Candy(inputItems[1], BigDecimal.valueOf(Double.parseDouble(inputItems[2])),inputItems[3], 5));
//                }
//                else if (inputItems[3].equals("Gum")){
//                    keyAndValueMap.put(inputItems[0], new Gum(inputItems[1], BigDecimal.valueOf(Double.parseDouble(inputItems[2])),inputItems[3],5 ));
//                }
            }
        } catch(
        FileNotFoundException e)

        {e.getMessage();
        }
            return keyAndValueMap;
    }

}

