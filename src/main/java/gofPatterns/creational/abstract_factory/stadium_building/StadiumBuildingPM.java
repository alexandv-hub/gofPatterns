package gofPatterns.creational.abstract_factory.stadium_building;

import gofPatterns.creational.abstract_factory.ProjectManager;

public class StadiumBuildingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages the stadium building project...");
    }
}
