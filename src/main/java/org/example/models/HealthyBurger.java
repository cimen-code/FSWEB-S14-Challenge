package org.example.models;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = calculateHamburgerPrice()
                + healthyExtra1Price
                + healthyExtra2Price;

        setPrice(totalPrice);

        printHamburgerDetails();

        if (healthyExtra1Name != null) {
            System.out.println("HealthyAddition1: " + healthyExtra1Name);
        }

        if (healthyExtra2Name != null) {
            System.out.println("HealthyAddition2: " + healthyExtra2Name);
        }

        System.out.println("Price: " + totalPrice);

        return totalPrice;
    }
}
