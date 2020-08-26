package staff;

import com.sun.istack.internal.NotNull;

public abstract class Employee {
    private String name;
    private String NI;
    private int salary;

    public Employee(String name, String NI, int salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void raiseSalary(Double increment) {
        if (increment >= 1.0) {
            this.salary *= increment;
        }
    }

    public Double payBonus() {
        return this.salary * 0.01;
    }
}
