package gofPatterns.structural.adapter;

public class AdapterTypeCToLightning extends Iphone implements TypeC {

    @Override
    public void chargeWithTypeC() {
        chargeIphone();
    }
}
