package gofPatterns.behavioral.state;

public class Task {
    TaskActivity activity;

    public void setActivity(TaskActivity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof ClarifyingRequirements) {
            setActivity(new DesigningSolution());
        } else if (activity instanceof DesigningSolution) {
            setActivity(new WritingCode());
        } else if (activity instanceof WritingCode) {
            setActivity(new Testing());
        } else if (activity instanceof Testing) {
            setActivity(new ProductionDeployment());
        } else if (activity instanceof ProductionDeployment) {
            setActivity(new ClarifyingRequirements());
        }
    }

    public void workOnTask() {
        activity.workOnTask();
    }
}
