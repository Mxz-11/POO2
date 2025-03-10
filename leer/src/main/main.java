package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data1 = 5;
		String data2 = "hello good morning object streams";
		
		try {
			FileOutputStream file = new FileOutputStream("src/main/hola.txt");
			ObjectOutputStream output = new ObjectOutputStream(file);
			
			// Writing to the file using ObjectOutputStream
			output.writeInt(data1);
			output.writeObject(data2);
			
			FileInputStream fileStream = new FileInputStream("src/main/hola.txt");
			// Creating an object input stream
			ObjectInputStream objStream = new ObjectInputStream(fileStream);
			
			//Using the readInt() method
			System.out.println("Integer data :" + objStream.readInt());
			
			// Using the readObject() method
			System.out.println("String data: " + objStream.readObject());
			
			output.close();
			objStream.close();
			}
			catch (Exception e) {
				e.getStackTrace();
			}
	}

}
