import static org.junit.Assert.*;

import org.junit.Test;

public class Deliverable5 {

	//Tests that original and refactored convertToInt() produce same output with base cases
	@Test
	public void convertToIntTestBaseInt() {
		MainPanel mp = new MainPanel(15);
		
		for (int i = 1; i < 100; i++) {
			assertEquals(mp.convertToInt(i), mp.originalConvertToInt(i));
		}
	}
	
	//Tests that original and refactored convertToInt() produce DIFFERENT output with edge case of negative values
	//(they are not equal because the original convertToInt() has an error with negative numbers)
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
	
	//Tests that original and refactored convertToInt() produce same output with edge case of zero
	@Test
	public void convertToIntTestZero() {
		MainPanel mp = new MainPanel(15);
		assertEquals(mp.convertToInt(0), mp.originalConvertToInt(0));
	}
	
	//Tests that original and refactored convertToInt() produce same output with edge case of max_value
	@Test
	public void convertToIntTestMax() {
		MainPanel mp = new MainPanel(15);
		assertEquals(mp.convertToInt(Integer.MAX_VALUE), mp.originalConvertToInt(Integer.MAX_VALUE));
	}
	
	//Tests that original and refactored Cell.toString() produce same output when cells are alive
	@Test
	public void CellToStringTestAlive() {
		Cell cell = new Cell(true);
		assertEquals(cell.toString(), cell.originalToString());
	}
	
	//Tests that original and refactored Cell.toString() produce same output when cells are not alive
	@Test
	public void CellToStringTestAliveFalse() {
		Cell cell = new Cell();
		assertEquals(cell.toString(), cell.originalToString());
	}

}
