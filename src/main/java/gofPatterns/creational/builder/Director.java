package gofPatterns.creational.builder;

public class Director {
    HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    House buildHouse() {
        builder.buildName();
        builder.buildStoreys();
        builder.buildWindows();
        builder.buildPrice();

        House house = builder.getHouse();
        return house;
    }
}
