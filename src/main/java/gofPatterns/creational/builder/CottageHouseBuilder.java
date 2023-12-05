package gofPatterns.creational.builder;

public class CottageHouseBuilder extends HouseBuilder {

    @Override
    void buildName() {
        house.setName("Cottage");
    }

    @Override
    void buildStoreys() {
        house.setStoreysNum(2);
    }

    @Override
    void buildWindows() {
        house.setWindowsType(WindowsType.WOODEN);
    }

    @Override
    void buildPrice() {
        house.setSellingPrice(10_000);
    }
}
