package gofPatterns.creational.abstract_factory.office_building;

import gofPatterns.creational.abstract_factory.Contractor;

public class OfficeBuildingContractor implements Contractor {
    @Override
    public void build() {
        System.out.println("Contractor constructs the office building...");
    }
}
