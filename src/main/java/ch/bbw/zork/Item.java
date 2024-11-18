package ch.bbw.zork;

public class Item {

    private final String name;
    private final String description;
    private final int weight;

    public String getDescription() {
        return description + " (" + weight + " Kilogramm)";
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return description;
    }

    public int getWeightInGramm(){
        return weight;
    }

    public Item(String name, String description, int weightInGramm) {
        this.name = name;
        this.description = description;
        this.weight = weightInGramm;
    }
}
