package org.example.models;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    private double basePrice;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.basePrice = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
    }

    protected double calculateHamburgerPrice() {
        return basePrice
                + addition1Price
                + addition2Price
                + addition3Price
                + addition4Price;
    }

    protected void printHamburgerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Meat: " + meat);
        System.out.println("BreadRollType: " + breadRollType);

        if (addition1Name != null) {
            System.out.println("Addition1: " + addition1Name);
        }

        if (addition2Name != null) {
            System.out.println("Addition2: " + addition2Name);
        }

        if (addition3Name != null) {
            System.out.println("Addition3: " + addition3Name);
        }

        if (addition4Name != null) {
            System.out.println("Addition4: " + addition4Name);
        }
    }

    public double itemizeHamburger() {
        double totalPrice = calculateHamburgerPrice();
        setPrice(totalPrice);

        printHamburgerDetails();
        System.out.println("Price: " + totalPrice);

        return totalPrice;
    }
}
