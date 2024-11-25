package ch.bbw.zork;

import java.util.ArrayList;

public class Backpack {

    private final int maxWeight;
    private int currentWeight;
    private final ArrayList<Item> items;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public boolean addItem(Item item) {
        if (currentWeight + item.getWeightInGramm() <= maxWeight) {
            items.add(item);
            currentWeight += item.getWeightInGramm();
            return true;
        } else {
            System.out.println("Das Item überschreitet das maximal erlaubte Gewicht!");
            return false;
        }
    }

    public void removeItem(Item item) {
        if (items.remove(item)) {
            currentWeight -= item.getWeightInGramm();
        }
    }

    public void showItems() {
        System.out.println("Items im Rucksack:");
        for (Item item : items) {
            System.out.println("- " + item.getName() + ": " + item.getDesc());
        }
    }
}
