
public class Depart extends Employee {
	private String department;
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	public void getInformation() {
		System.out.printf("�̸� : %s   ���� : %d   �μ� : %s\n", getName(), getSalary(), department);
	}

}
