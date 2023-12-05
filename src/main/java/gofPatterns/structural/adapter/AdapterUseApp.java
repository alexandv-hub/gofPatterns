package gofPatterns.structural.adapter;

public class AdapterUseApp {
    public static void main(String[] args) {
        TypeC typeC = new AdapterTypeCToLightning();
        typeC.chargeWithTypeC();
    }
}
