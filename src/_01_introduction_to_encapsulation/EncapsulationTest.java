package _01_introduction_to_encapsulation;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class EncapsulationTest {

	EncapsulateTheData ed = new EncapsulateTheData();

	@Test
	public void testItemsReceived() {
		
		ed.setItemsRecieved(50);
		assertEquals(50, ed.getItemsRecieved());
		ed.setItemsRecieved(-45);
		assertEquals(0, ed.getItemsRecieved());
	}

	@Test
	public void testDegreesTurned() {
		
		ed.setDegreesTurned(260);
		assertEquals(260,ed.getDegreesTurned());
		ed.setDegreesTurned(450);
		assertEquals(360,ed.getDegreesTurned());
		ed.setDegreesTurned(-30);
		assertEquals(0,ed.getDegreesTurned());
	}
	
	@Test 
	public void testNomenclature() {
		
		ed.setNomenclature("");
		assertEquals(" ", ed.getNomenclature());
	}
	
	@Test
	public void testMemberObj() {
		
		ed.setMemberObj("");
		assertTrue(ed.getMemberObj() instanceof Object);
	}

}

