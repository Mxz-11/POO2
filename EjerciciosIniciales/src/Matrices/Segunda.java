package Matrices;

public class Segunda extends Padre{
	private
		int p[];
		int s[];
		int t[];
		
	public Segunda(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
		setId(2);
		p = new int[3];
		s = new int[3];
		t = new int[3];
		p[0] = n1;
		p[1] = n2;
		p[2] = n3;
		s[0] = n4;
		s[1] = n5;
		s[2] = n6;
		t[0] = n7;
		t[1] = n8;
		t[2] = n9;
	}
	public Segunda() {
		setId(2);
		p = new int[3];
		s = new int[3];
		t = new int[3];
	}
	
	public int getIdMatriz() {
		return getId();
	}
	
	@Override
	public void mostrar() {
		for (int i = 0; i < 3; i++) {
			System.out.print("|");
			System.out.print(p[i]);
		}
		System.out.print("|");
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print("|");
			System.out.print(s[i]);
		}
		System.out.print("|");
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print("|");
			System.out.print(t[i]);
		}
		System.out.print("|");
	}
	
	//(aei+bfg+cdh)−(ceg+bdi+afh)
	@Override
	public int det() {
		int res;
		res = (p[1]*s[2]*t[3] + p[2]*s[3]*t[1] + p[3]*s[1]*t[2]) - (p[3]*s[2]*t[1] + p[2]*s[1]*t[3] + p[1]*s[3]*t[2]);
		return res;
	}
}
