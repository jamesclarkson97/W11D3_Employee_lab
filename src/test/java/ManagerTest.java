import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Jeff", "F69", 30000, "Sales");
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.01);
        assertEquals(30300, manager.getSalary(), 0.5);
    }

    @Test
    public void
}
