package section06;

public class Practice04 {
	public static void main(String[] args) {
		int count = 1;
		int row = 0;
		int col = 2;

		int[][] arr = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[row][col] = count++;
				if(j != 4) {
					row--;
					col++;
				}
				if (row < 0) {	// 행이 맨 위에 도착하면 맨 아래로 이동
					row = 4;
				}
				if (col > 4) {	// 열이 오른쪽에 도달하면 왼쪽으로 이동
					col = 0;
				}
			}
			
			row++;
			
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("[" + arr[i][j] + "]\t");
			}
			System.out.println();
		}
	}
}
