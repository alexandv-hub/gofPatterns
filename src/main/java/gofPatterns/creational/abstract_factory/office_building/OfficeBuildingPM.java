package gofPatterns.creational.abstract_factory.office_building;

import gofPatterns.creational.abstract_factory.ProjectManager;

public class OfficeBuildingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages the office building project...");
    }
}
