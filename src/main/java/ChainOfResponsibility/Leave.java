package ChainOfResponsibility;

public class Leave {

    int noOfDays;
    int empTier;
    ReasonType reason;

    public Leave(int days, int tier, ReasonType reason){
        this.noOfDays = days;
        this.empTier = tier;
        this.reason = reason;
    }

    public int getNoOfDays() {
        return this.noOfDays;
    }

    public int getEmpTier() {
        return this.empTier;
    }

    public ReasonType getReasonType(){
        return this.reason;
    }
}
