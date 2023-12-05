package gofPatterns.creational.builder;

public abstract class HouseBuilder {
    House house = new House();

    abstract void buildName();
    abstract void buildStoreys();
    abstract void buildWindows();
    abstract void buildPrice();

    public House getHouse() {
        return house;
    }
}
