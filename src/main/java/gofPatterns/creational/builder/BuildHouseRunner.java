package gofPatterns.creational.builder;

public class BuildHouseRunner {
    public static void main(String[] args) {
        Director director = new Director();

//        director.setBuilder(new CottageHouseBuilder());
        director.setBuilder(new ResidentialHouseBuilder());

        House house = director.buildHouse();
        System.out.println(house);
    }
}
