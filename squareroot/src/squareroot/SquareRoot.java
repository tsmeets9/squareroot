package squareroot;

public class SquareRoot {
	/**
	 * Return the square root, rounded down, of the given number.
	 * @pre The given number is nonnegative.
	 * 		| 0 <= x
	 * @post The square of the result is not greater than the given number.
	 * 		| result * result <= x
	 * @post The result is the greatest number whose square is not greater than the given number.
	 * 			| x < (result+ 1) * (result +1)
	 * This is made in class. 
	 */
	public int SquareRoot(int x) {
		int result = 0;
		while (result * result <= x)
			result++;
		return result -1 ;
	}
}
