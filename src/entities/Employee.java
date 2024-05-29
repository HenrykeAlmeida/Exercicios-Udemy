package entities;

public class Employee {
	public String name;
	public double salaryBruto;
	public double imposto;

	public double netSalary() {
		return salaryBruto - imposto;
	}

	public void increaseSalary(double percentage) {
		salaryBruto += salaryBruto * percentage / 100.0;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}

}
