package clase11_4;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyBytes {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("src/clase11_4/original.txt");
			out = new FileOutputStream("src/clase11_4/copiaBytes.txt");
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
