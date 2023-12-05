package gofPatterns.creational.abstract_factory.office_building;

import gofPatterns.creational.abstract_factory.Architect;
import gofPatterns.creational.abstract_factory.ConstructionProjectTeamFactory;
import gofPatterns.creational.abstract_factory.Contractor;
import gofPatterns.creational.abstract_factory.ProjectManager;

public class OfficeBuildingTeamFactory implements ConstructionProjectTeamFactory {
    @Override
    public Architect getArchitect() {
        return new OfficeBuildingArchitect();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new OfficeBuildingPM();
    }

    @Override
    public Contractor getContractor() {
        return new OfficeBuildingContractor();
    }
}
