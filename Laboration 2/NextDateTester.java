package wb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class NextDateTester {
	private NextDate nd;
	
	@Before
	public void init(){
		nd = new NextDate(1,1,1);
	}
	
	@Test
	public void testStatement1(){
		assertEquals("invalid Input Date", nd.run(5, 0, 2012));
	}
	@Test
	public void testStatement2(){
		assertEquals("2/1/2012", nd.run(1, 31, 2012));
	}
	@Test
	public void testStatement3(){
		assertEquals("1/31/2012", nd.run(1, 30, 2012));
	}
	@Test
	public void testStatement4(){
		assertEquals("4/2/2012", nd.run(4, 1, 2012));
	}
	@Test
	public void testStatement5(){
		assertEquals("5/1/2012", nd.run(4, 30, 2012));
	}
	@Test
	public void testStatement6(){
		assertEquals("Invalid Input Date", nd.run(4, 31, 2012));
	}
	@Test
	public void testStatement7(){
		assertEquals("2/2/2012", nd.run(2, 1, 2012));
	}
	@Test
	public void testStatement8(){
		assertEquals("2/29/2012", nd.run(2, 28, 2012));
	}
	@Test
	public void testStatement9(){
		assertEquals("3/1/2011", nd.run(2, 28, 2011));
	}
	@Test
	public void testStatement10(){
		assertEquals("3/1/2012", nd.run(2, 29, 2012));
	}
	@Test
	public void testStatement11(){
		assertEquals("Invalid Input Date", nd.run(2, 29, 2011));
	}
	@Test
	public void testStatement12(){
		assertEquals("Invalid Input Date", nd.run(2, 30, 2012));
	}
	@Test
	public void testStatement13(){
		assertEquals("12/13/2012", nd.run(12, 12, 2012));
	}
	@Test
	public void testStatement14(){
		assertEquals("invalid Input Date", nd.run(12, 32, 2012));
	}
	@Test
	public void testStatement15(){
		assertEquals("Invalid Next Year", nd.run(12, 31, 2021));
	}
	@Test
	public void testStatement16(){
		assertEquals("invalid Input Date", nd.run(12, 32, 2021));
	}
	@Test
	public void testStatement17(){
		assertEquals("invalid Input Date", nd.run(14, 12, 2012));
	}
	@Test
	public void testStatement18(){
		assertEquals("invalid Input Date", nd.run(11, 12, 2022));
	}
	@Test
	public void testStatement19(){
		assertEquals("invalid Input Date", nd.run(0, 12, 2002));
	}
	@Test
	public void testStatement20(){
		assertEquals("invalid Input Date", nd.run(5, 12, 1800));
	}
	@Test
	public void testStatement21(){
		assertEquals("3/1/2000", nd.run(2, 29, 2000));
	}
	@Test
	public void testStatement22(){
		assertEquals("7/24/2012",nd.run(7,23,2012));
	}
	
}
/**
 * Statement coverage
 * 1800 - 0 - 0 
 * 2012 - 01 - 31
 * 2012 - 01 - 30
 * 2012 - 04 - 01
 * 2012 - 04 - 30
 * 2012 - 04 - 31
 * 2012 - 02 - 01
 * 2012 - 02 - 28
 * 2011 - 02 - 28
 * 2012 - 02 - 29
 * 2011 - 02 - 29
 * 2012 - 02 - 30
 * 2012 - 12 - 12
 * 2012 - 12 - 32
 * 2021 - 12 - 32
 * 2022 - 13 - 12
 * 
 * Branch coverage
 * 
 * 
 * Decision coverage
 * 
 **/

/*hej, denna klassen gör deta..*/
