package design;

public abstract class EmployeeAbstract implements Employee {
    public abstract void employeeCalls();
    public abstract void employeeBathroom();
    public void eatLunch() {
        System.out.println("Employee Lunch Break");

    }
}
