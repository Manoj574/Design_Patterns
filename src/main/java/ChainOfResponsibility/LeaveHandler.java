package ChainOfResponsibility;

public abstract class LeaveHandler {

    LeaveHandler supervisor;
    public void setSupervisor(LeaveHandler supervisor){
        this.supervisor = supervisor;
    }

    public abstract String applyLeave(Leave leave);
}
