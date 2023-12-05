package gofPatterns.creational.abstract_factory.stadium_building;

import gofPatterns.creational.abstract_factory.Architect;

public class StadiumBuildingArchitect implements Architect {
    @Override
    public void designBuilding() {
        System.out.println("Architect designs stadium building...");
    }
}
