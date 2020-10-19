package day1;

public class Employee1 {

	private int salary;

	private int bonus;

	// Read Access
	public int getSalary() {
		return salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {

		if (bonus > 0) {
			this.bonus = bonus;
		}
	}

	// Write Access
	public void setSalary(int salary) {

		if (salary >= 0) {

			this.salary = salary;

		}
	}

	int calculateSalary() {
		int totalSalary = salary + bonus;

		return totalSalary;
	}

}
