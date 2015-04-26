package ita.softserve.iilntc;

public class Bookkeeper {
    public static void main (String [] args){
        HourSalaryWorker a = new HourSalaryWorker(1, "John", "Thompson", 50.00);
        HourSalaryWorker b = new HourSalaryWorker(2, "Sarah", "Loich", 60.00);
        HourSalaryWorker c = new HourSalaryWorker(3, "Tomas", "Gordon", 61.00);

        FixedSalaryWorker e = new FixedSalaryWorker(4, "Garry", "Writer", 3900.00);
        FixedSalaryWorker f = new FixedSalaryWorker(5, "Mimi", "Lo", 5000.00);
        FixedSalaryWorker g = new FixedSalaryWorker(6, "Moro", "Moon", 9000.00);

        System.out.println(a.getWorkerInformation());
        System.out.println(b.getWorkerInformation());
        System.out.println(c.getWorkerInformation());

        System.out.println(e.getWorkerInformation());
        System.out.println(f.getWorkerInformation());
        System.out.println(g.getWorkerInformation());
    }
}