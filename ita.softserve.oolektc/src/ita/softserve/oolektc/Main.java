package ita.softserve.oolektc;

public class Main {

    public static void main(String[] args) {

    Employee employee1 = new HourlyWageEmployee(1,"John","Smith",12);
    Employee employee2 = new HourlyWageEmployee(2,"Sue","Calahan",9);

    Employee employee3 = new FixedWageEmployee(3,"Jack","Black",300);
    Employee employee4 = new FixedWageEmployee(4,"Eve","Stone",270);

    employee1.getEmployeeInfo();
    employee2.getEmployeeInfo();
    employee3.getEmployeeInfo();
    employee4.getEmployeeInfo();

    }

}
