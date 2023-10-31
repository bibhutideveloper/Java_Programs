package javaIO;
import java.io.FileOutputStream;

public class FileHandlingOutput {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("F://file_handling/sample.txt");
			fout.write(67); // ASCII		
			String str = "\nHello World\\"; // Converting String to byte
			byte b[] = str.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("file created");
		}catch(Exception e){
			System.out.println("file not found.");
		}
	}

}
