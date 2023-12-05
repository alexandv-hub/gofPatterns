package gofPatterns.creational.builder;

public class ResidentialHouseBuilder extends HouseBuilder {

    @Override
    void buildName() {
        house.setName("Multi-story residential house");
    }

    @Override
    void buildStoreys() {
        house.setStoreysNum(9);
    }

    @Override
    void buildWindows() {
        house.setWindowsType(WindowsType.PLASTIC);
    }

    @Override
    void buildPrice() {
        house.setSellingPrice(1_000_0000);
    }
}
