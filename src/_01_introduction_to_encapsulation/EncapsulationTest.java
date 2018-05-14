package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
