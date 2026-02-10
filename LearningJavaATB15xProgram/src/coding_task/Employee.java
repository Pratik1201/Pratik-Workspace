package coding_task;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("John Doe");
		e.setSalary(50000.0);
		
		System.out.println("Employee ID: " + e.getId()+ ", Employee Name: " + e.getName() + ", Salary: " + e.getSalary());
	}
}
