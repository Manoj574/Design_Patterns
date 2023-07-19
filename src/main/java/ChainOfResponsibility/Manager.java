package ChainOfResponsibility;

public class Manager extends LeaveHandler{
    @Override
    public String applyLeave(Leave leave) {
        if(leave.empTier <= 2 && !leave.getReasonType().equals(ReasonType.REGULAR)){
            return "Your Leave Request has been Approved by Manager";
        }
        return "Your Leave Request has been DENIED by Manager";
    }
}
