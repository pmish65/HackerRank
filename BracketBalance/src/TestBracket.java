import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBracket {

	@Test
	void test1() {
		assertEquals("Yes",Solution.isBalanced("{{[[(())]]}}")); 
	}

}
