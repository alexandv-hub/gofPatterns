package gofPatterns.creational.abstract_factory.office_building;

import gofPatterns.creational.abstract_factory.Architect;

public class OfficeBuildingArchitect implements Architect {
    @Override
    public void designBuilding() {
        System.out.println("Architect designs office building...");
    }
}
