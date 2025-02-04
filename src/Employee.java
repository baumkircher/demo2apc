public class Employee extends Person {
    private int supervisorId;
    private double salary;

    //konstruktor
    public Employee(String firstName, String lastName, int age, int supervisorId, double salary) {
        super(firstName, lastName, age);
        this.supervisorId = supervisorId;
        this.salary = salary;
    }
    //getter und setter
    public int getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Employee{" +
                "supervisorId=" + supervisorId +
                ", salary=" + salary +
                '}';
    }
}
