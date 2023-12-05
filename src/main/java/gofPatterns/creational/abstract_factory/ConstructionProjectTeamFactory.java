package gofPatterns.creational.abstract_factory;

public interface ConstructionProjectTeamFactory {
    Architect getArchitect();
    ProjectManager getProjectManager();
    Contractor getContractor();
}
