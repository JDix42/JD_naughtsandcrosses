public class testBoardFun {

	Board a = new Board();

	public static void main(String[] args) {
	}

	public void testBoardResult(char val) {
	System.out.print(val);
	}

	public void testBoardReport() {
	a.arr[0][0] = 1;
	a.arr[0][1] = 2;
	a.reportValues();
	a.reportGame();
	}

	// Reset game board
	public void testReset() {
	a.arr[0][0] = 0;
	a.arr[0][1] = 0;
	a.arr[0][2] = 0;
	a.arr[1][0] = 0;
	a.arr[1][1] = 0;
	a.arr[1][2] = 0;
	a.arr[2][0] = 0;
	a.arr[2][1] = 0;
	a.arr[2][2] = 0;
	}

	// Test to see no win on an empty board with
	// a horizontal line
	public char testBoardHorLossZ() {

	int test = a.checkWinHor();

	char res = 'T';

	if (test == 0) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}

	// Test to see no win on an empty board with
	// a horizontal line
	public char testBoardVerLossZ() {

	int test = a.checkWinVer();

	char res = 'T';

	if (test == 0) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}

	// Test to see no win on an empty board with
	// a diagonal line
	public char testBoardDiaLossZ() {

	int test = a.checkWinDia();

	char res = 'T';

	if (test == 0) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}

	// Test for player 1 win top Horizontal row

	public char testBoardWinHorT1() {
	a.arr[0][0] = 1;
	a.arr[0][1] = 1;
	a.arr[0][2] = 1;

	int test = a.checkWinHor();

	char res = 'T';

	if (test == 1) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}

	// Test for player 2 win top horizontal row

	public char testBoardWinHorT2() {
	a.arr[0][0] = 2;
	a.arr[0][1] = 2;
	a.arr[0][2] = 2;

	int test = a.checkWinHor();

	char res = 'T';

	if (test == 2) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}
	
	// Test for player 1 win middle horizontal row
	public char testBoardWinHorM1() {
	a.arr[1][0] = 1;
	a.arr[1][1] = 1;
	a.arr[1][2] = 1;

	int test = a.checkWinHor();

	char res = 'T';

	if (test == 1) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}

	// Test for player 2 win middle horizontal row
	public char testBoardWinHorM2() {
	a.arr[1][0] = 2;
	a.arr[1][1] = 2;
	a.arr[1][2] = 2;

	int test = a.checkWinHor();

	char res = 'T';

	if (test == 2) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}

	// Test for player 1 win bottom horizontal row
	public char testBoardWinHorB1() {
	a.arr[2][0] = 1;
	a.arr[2][1] = 1;
	a.arr[2][2] = 1;

	int test = a.checkWinHor();

	char res = 'T';

	if (test == 1) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}

	// Test for player 2 win bottom horizontal row
	public char testBoardWinHorB2() {
	a.arr[2][0] = 2;
	a.arr[2][1] = 2;
	a.arr[2][2] = 2;

	int test = a.checkWinHor();

	char res = 'T';

	if (test == 2) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}

	// Test for player 1 win left Vert row

	public char testBoardWinVerL1() {
	a.arr[0][0] = 1;
	a.arr[1][0] = 1;
	a.arr[2][0] = 1;

	int test = a.checkWinVer();

	char res = 'T';

	if (test == 1) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}

	// Test for player 2 win left Vert row

	public char testBoardWinVerL2() {
	a.arr[0][0] = 2;
	a.arr[1][0] = 2;
	a.arr[2][0] = 2;

	int test = a.checkWinVer();

	char res = 'T';

	if (test == 2) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}
	
	// Test for player 1 win middle Vert row
	public char testBoardWinVerM1() {
	a.arr[0][1] = 1;
	a.arr[1][1] = 1;
	a.arr[2][1] = 1;

	int test = a.checkWinVer();

	char res = 'T';

	if (test == 1) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}

	// Test for player 2 win middle Vert row
	public char testBoardWinVerM2() {
	a.arr[0][1] = 2;
	a.arr[1][1] = 2;
	a.arr[2][1] = 2;

	int test = a.checkWinVer();

	char res = 'T';

	if (test == 2) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}

	// Test for player 1 win bottom Vert row
	public char testBoardWinVerR1() {
	a.arr[0][2] = 1;
	a.arr[1][2] = 1;
	a.arr[2][2] = 1;

	int test = a.checkWinVer();

	

	char res = 'T';

	if (test == 1) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}

	// Test for player 2 win bottom Vert row
	public char testBoardWinVerR2() {
	a.arr[0][2] = 2;
	a.arr[1][2] = 2;
	a.arr[2][2] = 2;

	int test = a.checkWinVer();

	char res = 'T';

	if (test == 2) {
		res = '.'; }
	else {
		res = 'F'; }

	return res;
	
	}
}
