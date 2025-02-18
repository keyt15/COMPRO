package main;

import java.util.ArrayList;

class Coffee {
    String name;
    String type;
    String size;
    double price;
    String roastLevel;
    String origin;
    boolean isDecaf;
    int stock;
    ArrayList<String> flavorNotes;
    String brewMethod;

    public Coffee(String name, String type, String size, double price, String roastLevel, String origin, boolean isDecaf, int stock, ArrayList<String> flavorNotes, String brewMethod) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
        this.roastLevel = roastLevel;
        this.origin = origin;
        this.isDecaf = isDecaf;
        this.stock = stock;
        this.flavorNotes = new ArrayList<>(flavorNotes);
        this.brewMethod = brewMethod;
    }

    public void calculatePrice(String size) {
        switch (size.toLowerCase()) {
            case "small":
                this.price *= 0.9;
                break;
            case "medium":
                this.price *= 1.0;
                break;
            case "large":
                this.price *= 1.2;
                break;
        }
    }

    public boolean checkStock() {
        return stock > 0;
    }

    public void addFlavor(String note) {
        flavorNotes.add(note);
    }

    public void updateStock(int quantity) {
        this.stock += quantity;
    }

    public String describe() {
        return "A " + roastLevel + " roast " + name + " with " + String.join(", ", flavorNotes) + " notes.";
    }

    public void setDecaf(boolean isDecaf) {
        this.isDecaf = isDecaf;
    }

    public void changeRoastLevel(String newRoastLevel) {
        this.roastLevel = newRoastLevel;
    }

    public void discount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }
}
