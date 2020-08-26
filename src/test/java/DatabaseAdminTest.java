import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Jeff", "F69", 30000);
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1.01);
        assertEquals(30300, databaseAdmin.getSalary(), 0.5);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300, databaseAdmin.payBonus(), 0.5);
    }
}
