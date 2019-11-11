import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryTest {
	
	Inventory instance;
	InventoryItem i;
	@BeforeEach
	void setUp() throws Exception {
		instance = new Inventory();
		i = new InventoryItem("gun", 20, "knife", 10);
	

	@AfterEach
	void tearDown() throws Exception {
		instance = null;
		i = null;
	}

	@Test
	void testaddItemToInventory() {
		boolean result = instance.addItemToInventory(i);
		assertTrue(result);
	}

	@Test
	void testdropInventoryItem() {
		boolean result = instance.dropInventoryItem(i);
		assertFalse(result);
		
	}

	@Test
	void testgetWeight() {
		int actual = 0;
		int result = instance.getWeight();
		assertEquals(actual, result);
		
	}

	@Test
	void testgetCount() {
		int actual = 0;
		int result = instance.getCount();
		assertEquals(actual, result);
	}
}
