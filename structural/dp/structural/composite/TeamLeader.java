package dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader implements Employee {
	private final List<Employee> employees = new ArrayList<Employee>();

	@Override
	public void writeInfo() {
		for (Employee employee : this.employees) {
			employee.writeInfo();
		}
	}

	public void addTeamMember(Employee employee) {
		this.employees.add(employee);
	}

	public void removeTeamMember(Employee employee) {
		this.employees.remove(employee);
	}
}
