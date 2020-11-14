import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	Property p1 ,p2,p3,p4,p5,p6;
	ManagementCompany m ; 
	@Before
	public void setUp() throws Exception {
		//student create a management company
		
		//student add three properties, with plots, to mgmt co
		p1 = new Property ("Kobe Bryant", "Los Angelos", 5844.00, "Sammy Sosa",3,1,2,2);
		p2 = new Property ("Nothing", "Nothing", 3114, "Timmy Turner",8,1,2,2);
		p3 = new Property ("Wolfs Lodge", "River", 6905, "Bruce Banner",6,1,2,2);
		m= new ManagementCompany("Doofenshmirtz", "888888888",6);
	 
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
		p1 = p2 = p3 = p4 = p5 = p6 = null;
		m = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		p4 = new Property ("Sensational", "David", 1234, "Bob Son",6,5,2,2);
		p5 = new Property ("Luray Caverns", "Derfpoint", 4327, "Remy Chips",3,5,2,2);
		p6 = new Property ("Too Many Properties", "NoSir", 1234, "Jimmy BagODonuts",2,5,2,2);
		 
		assertEquals(m.addProperty(p4),3,0);
		assertEquals(m.addProperty(p5),4,0);
		assertEquals(m.addProperty(p6),-1,0);  //exceeds the size of the array and can not be added, add property should return -1	
	}
 
	@Test
	public void testMaxRentProp() {
		String maxRentString = m.maxRentProp().split("\n")[3];
		assertTrue(maxRentString.contains("6905"));		
	}

	@Test
	public void testTotalRent() {
		assertEquals(m.totalRent(),15863.0,0);	
	}

 }