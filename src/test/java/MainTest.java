import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testCalculateElectricityBill() {
        // Test case for kWh less than or equal to 50
        assertEquals(33560, Main.calculateElectricityBill(20));

        // Test case for kWh between 51 and 200
        assertEquals(126194, Main.calculateElectricityBill(71));
        // Test case for kWh between 201 and 400
        assertEquals(669400, Main.calculateElectricityBill(300));
        // Test case for kWh over 400
        assertEquals(1245500, Main.calculateElectricityBill(500));
    }
}