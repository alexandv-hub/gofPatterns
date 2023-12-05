package gofPatterns.creational.abstract_factory.stadium_building;

import gofPatterns.creational.abstract_factory.Architect;
import gofPatterns.creational.abstract_factory.ConstructionProjectTeamFactory;
import gofPatterns.creational.abstract_factory.Contractor;
import gofPatterns.creational.abstract_factory.ProjectManager;

public class StadiumBuildingTeamFactory implements ConstructionProjectTeamFactory {
    @Override
    public Architect getArchitect() {
        return new StadiumBuildingArchitect();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new StadiumBuildingPM();
    }

    @Override
    public Contractor getContractor() {
        return new StadiumBuildingContractor();
    }
}
