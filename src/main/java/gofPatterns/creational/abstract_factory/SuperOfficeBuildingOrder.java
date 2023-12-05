package gofPatterns.creational.abstract_factory;

import gofPatterns.creational.abstract_factory.office_building.OfficeBuildingTeamFactory;

public class SuperOfficeBuildingOrder {
    public static void main(String[] args) {
        ConstructionProjectTeamFactory constructionProjectTeamFactory
                = new OfficeBuildingTeamFactory();

        Architect architect = constructionProjectTeamFactory.getArchitect();
        Contractor contractor = constructionProjectTeamFactory.getContractor();
        ProjectManager projectManager = constructionProjectTeamFactory.getProjectManager();

        System.out.println("Starting create super office building...");
        architect.designBuilding();
        contractor.build();
        projectManager.manageProject();
    }
}
