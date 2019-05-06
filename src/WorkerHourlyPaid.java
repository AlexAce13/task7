public class WorkerHourlyPaid implements Salary {

    public double salary(){
        double paidSalary;
        paidSalary = 8.5;
        int hours = 276;

        return hours * paidSalary;
    }

}
