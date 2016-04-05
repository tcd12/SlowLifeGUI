import static org.junit.Assert.*;

import org.junit.Test;

public class Deliverable5 {

	@Test
	public void convertToIntTestBaseInt() {
		MainPanel mp = new MainPanel(15);
		
		for (int i = 1; i < 100; i++) {
			assertEquals(mp.convertToInt(i), mp.originalConvertToInt(i));
		}
	}
	
	@Test
	public void convertToIntTestNegative() {
		MainPanel mp = new MainPanel(15);
		int origResult;
		int newRes = 0;
		
		for (int i = -1; i > -50; i--) {
			origResult = 0;
			try {
				origResult = mp.originalConvertToInt(i);
			} catch (Exception e) {
				//expected because original gets a numberformatexception with negative numbers
			}
			newRes = mp.convertToInt(i);
			assertNotEquals(newRes, origResult);	//origResult should be 0
		}
		
	}
	
	@Test
	public void convertToIntTestZero() {
		MainPanel mp = new MainPanel(15);
		assertEquals(mp.convertToInt(0), mp.originalConvertToInt(0));
	}
	
	@Test
	public void convertToIntTestMax() {
		MainPanel mp = new MainPanel(15);
		assertEquals(mp.convertToInt(Integer.MAX_VALUE), mp.originalConvertToInt(Integer.MAX_VALUE));
	}
	
	@Test
	public void CellToStringTestAlive() {
		Cell cell = new Cell(true);
		assertEquals(cell.toString(), cell.originalToString());
	}
	
	@Test
	public void CellToStringTestAliveFalse() {
		Cell cell = new Cell();
		assertEquals(cell.toString(), cell.originalToString());
	}
	
	//////////////////////////ADD RUNCONTINUOUS TESTS/////////////////////////////////
	@Test
	public void runContinuousTest() {
		MainPanel mp = new MainPanel(15);
		
	}

}
