package ita.softserve.sazartc;

public class PerHourEmployee extends Employee {
	
	private float hourTax;
	
	PerHourEmployee(int id, String name, String surname, float hourTax) {
		super.id = id;
		super.name = name;
		super.surname = surname;
		this.hourTax = hourTax;
	}		

	@Override
	public float SalaryCalc() {
		float salary;
		salary = (float) (hourTax * 20.8 * 8);
		return salary;
	}

}
