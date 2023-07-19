package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        ProjectLeader projectLeader = new ProjectLeader();
        Manager manager = new Manager();

        teamLeader.setSupervisor(projectLeader);
        projectLeader.setSupervisor(manager);

        Leave leave1 = new Leave(5, 3, ReasonType.REGULAR);
        System.out.println(teamLeader.applyLeave(leave1));

        Leave leave2 = new Leave(8, 5, ReasonType.REGULAR);
        System.out.println(teamLeader.applyLeave(leave2));

        Leave leave3 = new Leave(16, 2, ReasonType.SPECIAL);
        System.out.println(teamLeader.applyLeave(leave3));

        Leave leave4 = new Leave(17, 2, ReasonType.REGULAR);
        System.out.println(teamLeader.applyLeave(leave4));

    }
}
