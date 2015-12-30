package dp.structural.composite;

public class TeamMember implements Employee {
	private final String name;
	private final String salary;

	public TeamMember(String name, String salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void writeInfo() {
		System.out.println("Name : " + this.name + ", Salary : " + this.salary);
	}
}
