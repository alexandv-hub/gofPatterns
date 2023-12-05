package gofPatterns.structural.adapter;

public class Iphone implements Lightning {

    @Override
    public void chargeIphone() {
        System.out.println("Charging iphone...");
    }
}
