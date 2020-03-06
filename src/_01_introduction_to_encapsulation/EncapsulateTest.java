package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EncapsulateTest {
	EncapsulateTheData etd = new EncapsulateTheData();

	@Test
	public void testItemsReceived() {
		etd.setItemsReceived(-3);
		assertEquals(0, etd.getItemsReceived());
	}
	
	@Test
	public void testDegreesTurned() {
		etd.setDegreesTurned(-3);
		assertEquals(357, etd.getDegreesTurned());

		etd.setDegreesTurned(-370);
		assertEquals(350, etd.getDegreesTurned());

		etd.setDegreesTurned(-400);
		assertEquals(320, etd.getDegreesTurned());

		etd.setDegreesTurned(400);
		assertEquals(40, etd.getDegreesTurned());

		
	}
	
	@Test
	public void testNomenclature() {
		etd.setNomenclature("");
		assertEquals(" ",etd.getNomenclature());
	}

	@Test
	public void testObject() {
		etd.setObject(new String("abc"));
		assertEquals(Object.class,etd.getObject().getClass());
		
		etd.setObject(new EncapsulateTheData());
		assertEquals(EncapsulateTheData.class,etd.getObject().getClass());
	}



}
