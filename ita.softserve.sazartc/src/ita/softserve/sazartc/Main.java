package ita.softserve.sazartc;

public class Main {
	
	public static PerHourEmployee[] perHourEmployees;	
	public static FixedTaxEmployee[] fixedTaxEmployees;

	public static void main(String[] args) {

		perHourEmployees = new PerHourEmployee[3];
		perHourEmployees[0] = new PerHourEmployee(0, "Петренко", "Володимир", 25);
		perHourEmployees[1] = new PerHourEmployee(1, "Наказнюк", "Дмитро", 30);
		perHourEmployees[2] = new PerHourEmployee(2, "Павлюк", "Олег", 28);
		
		for(int i=0; i<3; i++) {
			perHourEmployees[i].SalaryPrint();
		}
		
		fixedTaxEmployees = new FixedTaxEmployee[3];
		fixedTaxEmployees[0] = new FixedTaxEmployee(3, "Остапчук", "Галина", 2500);
		fixedTaxEmployees[1] = new FixedTaxEmployee(4, "Мельник", "Василина", 3000);
		fixedTaxEmployees[2] = new FixedTaxEmployee(5, "Андрюк", "Оксана", 2800);
		
		for(int i=0; i<3; i++) {
			fixedTaxEmployees[i].SalaryPrint();
		}
	}

}
