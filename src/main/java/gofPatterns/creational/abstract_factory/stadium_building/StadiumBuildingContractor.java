package gofPatterns.creational.abstract_factory.stadium_building;

import gofPatterns.creational.abstract_factory.Contractor;

public class StadiumBuildingContractor implements Contractor {
    @Override
    public void build() {
        System.out.println("Contractor constructs the stadium building...");
    }
}
