import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestQueueUsingTwoStack {
	Solution s;
	@BeforeEach
	void init() {
		 s = new Solution();
	}
	@Test
	void test1() {
		s.enqueue(42);
		s.dequeue();
		s.enqueue(14);
		assertEquals(14,s.showFront());
		s.enqueue(28);
		assertEquals(14,s.showFront());
		s.enqueue(60);
		s.enqueue(78);
		s.dequeue();
		s.dequeue();
	}

}
