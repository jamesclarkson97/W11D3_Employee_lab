import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jeff", "F69", 30000);
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1.01);
        assertEquals(30300, developer.getSalary(), 0.5);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300, developer.payBonus(), 0.5);
    }
}
