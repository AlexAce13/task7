public abstract class Worker {

    public static void main(String[] args){

        WorkerHourlyPaid hourly = new WorkerHourlyPaid();
        WorkerMonthlyPaid monthly = new WorkerMonthlyPaid();

        System.out.println("Зарплата за рік, погодинна оплата: " + hourly.salary());
        System.out.println("Зарплата за рік, щомісячна оплата: " + monthly.salary());

    }

}
