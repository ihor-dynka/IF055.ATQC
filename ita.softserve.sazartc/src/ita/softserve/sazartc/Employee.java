package ita.softserve.sazartc;

public abstract class Employee {
	
	protected int id;
	protected String name;
	protected String surname;
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return surname;
	}

	public abstract float SalaryCalc();
	
	public void SalaryPrint() {
		System.out.printf("[%d] %s %s: ", getId(), getName(), getSurname());	
		System.out.printf("%.2f\n", SalaryCalc());
	}
}

