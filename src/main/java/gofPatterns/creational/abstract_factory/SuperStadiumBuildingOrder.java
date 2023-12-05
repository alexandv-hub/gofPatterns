package gofPatterns.creational.abstract_factory;

import gofPatterns.creational.abstract_factory.stadium_building.StadiumBuildingTeamFactory;

public class SuperStadiumBuildingOrder {
    public static void main(String[] args) {
        ConstructionProjectTeamFactory constructionProjectTeamFactory
                = new StadiumBuildingTeamFactory();

        Architect architect = constructionProjectTeamFactory.getArchitect();
        Contractor contractor = constructionProjectTeamFactory.getContractor();
        ProjectManager projectManager = constructionProjectTeamFactory.getProjectManager();

        System.out.println("Starting create super stadium building...");
        architect.designBuilding();
        contractor.build();
        projectManager.manageProject();
    }
}
