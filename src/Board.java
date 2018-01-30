public class Board {

//3x3 game board array. Initially this is populated with zeros
	int[][] arr = 	{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

//Game constructor
	public static void main(String[] args) {

	}

// Method to show how the values are populated across the board. A "1" corresponds
// to a "X" and a "2" corresponds to a "O".
	public void reportValues() {
	
	System.out.print(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2] + "\n");
	System.out.print("-+-+-" + "\n");
	System.out.print(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2] + "\n");
	System.out.print("-+-+-" + "\n");
	System.out.print(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2] + "\n");
}

// Method to report where the "O" and "X" are on the game board.
	public void reportGame() {
	
	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
		
		if (arr[i][j] == 0) {
			System.out.print("?"); }
		else if (arr[i][j] == 1) {
			System.out.print("X"); }
		else {
			System.out.print("O"); }

		if (j != 2) {
			System.out.print("|"); }
		else {
			System.out.print("\n"); }
		}

	if (i != 2) {
		System.out.print("-+-+-" + "\n") ; }
	}
	}

// Method to if there are three in a row and return what number won.
// Returning "1" means the "X" win and returning "2" means the "O" win.

// This check is for a horizontal winner
	public int checkWinHor() {
	
	int win = 0;
	
	if (arr[0][0] == 1 & arr[0][1] == 1 & arr[0][2] == 1) {
		win = 1;}
	else if( arr[0][0] == 2 & arr[0][1] == 2 & arr[0][2] == 2) {
		win = 2;}
	else if ( arr[1][0] == 1 & arr[1][1] == 1 & arr[1][2] == 1) {
		win = 1;}
	else if ( arr[1][0] == 2 & arr[1][1] == 2 & arr[1][2] == 2) {
		win = 2;}
	else if ( arr[2][0] == 1 & arr[2][1] == 1 & arr[2][2] == 1) {
		win = 1;}
	else if ( arr[2][0] == 2 & arr[2][1] == 2 & arr[2][2] == 2) {
		win = 2;}
	else {
		win = 0;}

	return win;
	
	}

// This check is for a vertical winner
	public int checkWinVer() {
	
	int win = 0;
	
	if (arr[0][0] == 1 & arr[1][0] == 1 & arr[2][0] == 1) {
		win = 1;}
	else if( arr[0][0] == 2 & arr[1][0] == 2 & arr[2][0] == 2) {
		win = 2;}
	else if ( arr[0][1] == 1 & arr[1][1] == 1 & arr[2][1] == 1) {
		win = 1;}
	else if ( arr[0][1] == 2 & arr[1][1] == 2 & arr[2][1] == 2) {
		win = 2;}
	else if ( arr[0][2] == 1 & arr[1][2] == 1 & arr[2][2] == 1) {
		win = 1;}
	else if ( arr[0][2] == 2 & arr[1][2] == 2 & arr[2][2] == 2) {
		win = 2;}
	else {
		win = 0;}

	return win;
	
	}

// This check is for a diagonal winner
	public int checkWinDia() {
	
	int win = 0;
	
	if (arr[0][0] == 1 & arr[1][1] == 1 & arr[2][2] == 1) {
		win = 1;}
	else if( arr[0][0] == 2 & arr[1][1] == 2 & arr[2][2] == 2) {
		win = 2;}
	else if ( arr[0][2] == 1 & arr[1][1] == 1 & arr[2][0] == 1) {
		win = 1;}
	else if ( arr[0][2] == 2 & arr[1][1] == 2 & arr[2][0] == 2) {
		win = 2;}
	else {
		win = 0;}

	return win;
	
	}
		

}

