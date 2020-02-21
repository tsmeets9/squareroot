package squareroot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareRootTest {
	@Test
	void test() {
		assert SquareRoot.SquareRoot(9) == 3;
		assert SquareRoot.SquareRoot(10) == 3;
		assert SquareRoot.SquareRoot(0) == 0;
		assert SquareRoot.SquareRoot(16) == 4;
	}

}
