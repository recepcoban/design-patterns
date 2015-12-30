package dp.structural.composite;

public class Composite {
	public static void main(String[] args) {
		TeamMember teamMember1 = new TeamMember("Recep", "1000");
		TeamMember teamMember2 = new TeamMember("Ayşe", "2000");
		TeamMember teamMember3 = new TeamMember("John", "5000");

		TeamLeader teamLeader1 = new TeamLeader();
		TeamLeader teamLeader2 = new TeamLeader();
		TeamLeader headLeader = new TeamLeader();

		teamLeader1.addTeamMember(teamMember1);
		teamLeader1.addTeamMember(teamMember2);
		teamLeader2.addTeamMember(teamMember3);

		headLeader.addTeamMember(teamLeader1);
		headLeader.addTeamMember(teamLeader2);

		headLeader.writeInfo();
	}
}
