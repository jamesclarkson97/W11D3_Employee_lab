package staff.management;

public class Director extends Manager{
    private final Double budget;

    public Director(String name, String NI, int salary, String deptName, Double budget) {
        super(name, NI, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    @Override
    public Double payBonus() {
        return super.payBonus() * 2;
    }
}
