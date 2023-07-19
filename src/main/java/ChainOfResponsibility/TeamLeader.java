package ChainOfResponsibility;

public class TeamLeader extends LeaveHandler{
    @Override
    public String applyLeave(Leave leave) {

        if(leave.noOfDays <= 7){
            if(leave.empTier <= 4){
                return "Your Leave Request has been Approved by TeamLeader";
            }
            else{
                return "Your employee Tier level is too low for request "+leave.noOfDays+" Days";
            }
        }
        return supervisor.applyLeave(leave);
    }
}
