package exceptionExample;

public class UseExample {

	private int r;
	
	public UseExample(int f){
		r = f;
	}
	
	public void prueba() throws exceptionExample {
		if (r == 0) {
			throw new exceptionExample("fallo");
		}else {
			System.out.println("Hola");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseExample u = new UseExample(0);
		
		try {
			u.prueba();
		} catch (exceptionExample e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}