package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		System.out.println("Enter your Name: ");
		emp.name = sc.nextLine();
		System.out.println("Enter your Gross Salary: ");
		emp.salaryBruto = sc.nextDouble();
		System.out.println("Enter the tax: ");
		emp.imposto = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();

		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);

		System.out.println("Updated data: " + emp);

		sc.close();
	}

}
