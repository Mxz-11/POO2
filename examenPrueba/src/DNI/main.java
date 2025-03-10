package DNI;

public class main {
	
	public boolean sonDistintos(dni d[]) {
		/*//Primero organizo el vector con el algoritmo de ordenación que me ha dado chatgpt
		int n = d.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (d[j].getNum() > d[j+1].getNum()) {
                    // Intercambiar d[j] y d[j+1]
                    dni temp = d[j];
                    d[j] = d[j+1];
                    d[j+1] = temp;
                }
            }
        }
        //ahora veo si están repetidos
        dni a = d[0];
        int i = 1;
        boolean encontrado = false;
        while (encontrado == false || i < d.length) {
        	if(a == d[i]) {
        		encontrado = true;
        	}else {
        		a = d[i];
        	}
        }
        return encontrado;*/
		return true;
	}
	
	public boolean sonDistintos2(dni d[]) {
		int n = d.length;
		//Primero se organiza el vector
		for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (d[j].getNum() > d[j+1].getNum()) {
                    // Intercambiar d[j] y d[j+1]
                    dni temp = d[j];
                    d[j] = d[j+1];
                    d[j+1] = temp;
                }
            }
        }
		int aux;
		//Luego se busca el repetido en el vector.
		for (int i = 0; i < n-1; i++) {
			aux = d[i].getNum();
			for (int j = 0; j < n-1; j++) {
				if (aux == d[i].getNum()) {
					return false;
				}
			}
        }
		return true;
	}
	
	public void mostrar(dni d[]) {
		for (int i = 0; i < d.length; i++) {
			String numeroFormateado = String.format("%08d", d[i].getNum());
			System.out.print(numeroFormateado + "-" + d[i].getLetra() + " - ");
			if (d[i].esValido() == true) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
