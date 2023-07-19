package ChainOfResponsibility;

public class ProjectLeader extends LeaveHandler{
    @Override
    public String applyLeave(Leave leave) {
        if(leave.noOfDays <= 14){
            if(leave.empTier <= 3){
                return "Your Leave Request has been Approved by Project Leader";
            }
            else{
                return "Your employee Tier level is too low for request "+leave.noOfDays+" Days";
            }
        }
        return supervisor.applyLeave(leave);
    }
}
