package clase11_4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class CopyCharacters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("src/clase11_4/ejemplo.txt");
			out = new FileWriter("src/clase11_4/salida.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			
		}
		finally {
			if (in != null) {
				in.close();
			}
			if (out != null){
				out.close();
			}
		}
		
	}

}
