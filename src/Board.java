public class Board {

	int[][] arr = 	{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

	public static void main(String[] args) {
	//int[][] arr = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
//System.out.println(java.util.Arrays.deepToString(arr));
//System.out.print(arr[0][0]);
	}

	public void reportValues() {
	
	System.out.print(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2] + "\n");
	System.out.print("-+-+-" + "\n");
	System.out.print(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2] + "\n");
	System.out.print("-+-+-" + "\n");
	System.out.print(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2] + "\n");
}

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

}

