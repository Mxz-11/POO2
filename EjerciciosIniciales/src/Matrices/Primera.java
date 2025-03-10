package Matrices;

public class Primera extends Padre{
	private
		int mat[][];
		static int maxMat = 3;
		
	public Primera() {
		setId(1);
		mat = new int[3][3];
	}
	
	public int getIdMatriz() {
		return getId();
	}
	
	@Override
	public void mostrar() {
		for (int i = 0; i < 3; i++) {
			System.out.print("|");
			for (int j = 0; j < 3; j++) {
				System.out.print(mat[i][j]);
				System.out.print("|");
			}
			System.out.println();
		}
	}
}
