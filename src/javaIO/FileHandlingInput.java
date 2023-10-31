package javaIO;
import java.io.FileInputStream;

public class FileHandlingInput {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("F://file_handling/sampleInput.txt");
			// READ ONLY SINGLE FIRST CHARACTER
//			int i = fin.read();
//			System.out.println((char)i);
			
			// READ WHOLE FILE
			int i = 0;
			// The read() method returns the next byte of data 
			// from the input stream. If it reaches the end of the file, 
			// it returns -1 to indicate that there is no more data to read.
			while((i=fin.read()) != -1) {
				System.out.print((char)i);
			}
			fin.close();
		}catch(Exception e){
			System.out.println("File not found");
		}
	}

}
