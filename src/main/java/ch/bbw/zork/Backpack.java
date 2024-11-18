package ch.bbw.zork;

import java.util.ArrayList;

public class Backpack {

    private final int maxWeight;  // Maximales Gewicht des Rucksacks in Gramm
    private int currentWeight;    // Aktuelles Gewicht im Rucksack
    private final ArrayList<Item> items;  // Die Items, die der Spieler trägt

    // Konstruktor
    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.items = new ArrayList<>();
    }

    // Gibt das aktuelle Gewicht des Rucksacks zurück
    public int getCurrentWeight() {
        return currentWeight;
    }

    // Gibt die Items im Rucksack zurück
    public ArrayList<Item> getItems() {
        return items;
    }

    // Fügt ein Item zum Rucksack hinzu, wenn es das Maximalgewicht nicht überschreitet
    public boolean addItem(Item item) {
        if (currentWeight + item.getWeightInGramm() <= maxWeight) {
            items.add(item);
            currentWeight += item.getWeightInGramm();
            return true;  // Item erfolgreich hinzugefügt
        } else {
            System.out.println("Das Item überschreitet das maximal erlaubte Gewicht!");
            return false;  // Item konnte nicht hinzugefügt werden
        }
    }

    // Entfernt ein Item aus dem Rucksack
    public void removeItem(Item item) {
        if (items.remove(item)) {
            currentWeight -= item.getWeightInGramm();
        }
    }

    // Gibt eine Liste der Items im Rucksack aus
    public void showItems() {
        System.out.println("Items im Rucksack:");
        for (Item item : items) {
            System.out.println("- " + item.getName() + ": " + item.getDesc());
        }
    }
}
