package Matrices;

public class Tercera extends Padre{
	private
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int num6;
	int num7;
	int num8;
	int num9;
	
	public Tercera() {
		setId(3);
	}
	
	public int getIdMatriz() {
		return getId();
	}
	
	@Override
	public void mostrar() {
		System.out.print("|");
		System.out.print(num1);
		System.out.print("|");
		System.out.print(num2);
		System.out.print("|");
		System.out.print(num3);		
		System.out.print("|");

		System.out.println();
		System.out.print("|");
		System.out.print(num4);
		System.out.print("|");
		System.out.print(num5);
		System.out.print("|");
		System.out.print(num6);		
		System.out.print("|");

		System.out.println();
		System.out.print("|");
		System.out.print(num7);
		System.out.print("|");
		System.out.print(num8);
		System.out.print("|");
		System.out.print(num9);
		System.out.print("|");
		
	}
}
