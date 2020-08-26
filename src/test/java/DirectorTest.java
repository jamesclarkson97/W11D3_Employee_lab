import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Jeff", "F69", 30000, "Sales", 1000000.01);
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, director.getSalary());
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000000.01, director.getBudget(), 0.05);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.01);
        assertEquals(30300, director.getSalary(), 0.5);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300, director.payBonus(), 0.5);
    }
}