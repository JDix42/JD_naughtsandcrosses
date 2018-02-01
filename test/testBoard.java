public class testBoard{

	public static void main(String[] args) {

	testBoardFun tb = new testBoardFun();

	// Test 1 - Checking no horizontal win with a board of zeros
	char t1 = tb.testBoardHorLossZ();
	tb.testBoardResult(t1);
	tb.testReset();

	// Test 2 - Checking a horizontal win across the
	// top of the board for player 1.
	char t2 = tb.testBoardWinHorT1();
	tb.testBoardResult(t2);
	tb.testReset();

	// Test 3 - Checking a horizontal win across the
	// top of the board for player 2.
	char t3 = tb.testBoardWinHorT2();
	tb.testBoardResult(t3);
	tb.testReset();

	// Test 4 - Checking a horizontal win across the
	// middle of the board for player 1.
	char t4 = tb.testBoardWinHorT1();
	tb.testBoardResult(t4);
	tb.testReset();

	// Test 5 - Checking a horizontal win across the
	// middle of the board for player 2.
	char t5 = tb.testBoardWinHorT2();
	tb.testBoardResult(t5);
	tb.testReset();

	// Test 6 - Checking a horizontal win across the
	// bottom of the board for player 1.
	char t6 = tb.testBoardWinHorT1();
	tb.testBoardResult(t6);
	tb.testReset();

	// Test 7 - Checking a horizontal win across the
	// bottom of the board for player 2.
	char t7 = tb.testBoardWinHorT2();
	tb.testBoardResult(t7);
	tb.testReset();

	// Test 8 - Checking no vertical win with a board of zeros
	char t8 = tb.testBoardVerLossZ();
	tb.testBoardResult(t8);
	tb.testReset();

	// Test 9 - Checking a vertical win across the
	// left of the board for player 1.
	char t9 = tb.testBoardWinVerL1();
	tb.testBoardResult(t9);
	tb.testReset();

	// Test 10 - Checking a vertical win across the
	// left of the board for player 2.
	char t10 = tb.testBoardWinVerL2();
	tb.testBoardResult(t10);
	tb.testReset();

	// Test 11 - Checking a vertical win across the
	// middle of the board for player 1.
	char t11 = tb.testBoardWinVerM1();
	tb.testBoardResult(t11);
	tb.testReset();

	// Test 12 - Checking a vertical win across the
	// middle of the board for player 2.
	char t12 = tb.testBoardWinVerM2();
	tb.testBoardResult(t12);
	tb.testReset();

	// Test 13 - Checking a vertical win across the
	// right of the board for player 1.
	char t13 = tb.testBoardWinVerR1();
	tb.testBoardResult(t13);
	tb.testReset();

	// Test 14 - Checking a vertical win across the
	// right of the board for player 2.
	char t14 = tb.testBoardWinVerR2();
	tb.testBoardResult(t14);
	tb.testReset();
	}
}

