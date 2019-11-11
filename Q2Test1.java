import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryItemTest {
	
	InventoryItem instance;
	
	@BeforeEach
	void setUp() throws Exception {
		instance = new InventoryItem("weapon", 20, "gun", 4);
	}

	@AfterEach
	void tearDown() throws Exception {
		instance = null;
	}

	@Test
	void testgetName() {
		String name = "gun";
		String s = instance.getName();
		assertEquals(name,s);
		
	}

	@Test
	void testgetType() {
		String type = "weapon";
		String t = instance.getType();
		assertEquals(type,t);
		
	}

	@Test
	void testgetWeight() {
		int weight = 20;
		int w = instance.getWeight();
		assertEquals(weight,w);
		
	}

	@Test
	void testgetCount() {
		int count = 4;
		int c = instance.getCount();
		assertEquals(count,c);
	}


}
