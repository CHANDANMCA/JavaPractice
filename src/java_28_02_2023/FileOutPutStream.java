package java_28_02_2023;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream {
	public static void main(String[] args) throws IOException {
		String name="hello java";
		FileOutputStream  fileOutputStream=new FileOutputStream("C:\\Users\\cks25\\OneDrive\\Desktop\\text.txt");
		byte[] bytes = name.getBytes();
		fileOutputStream.write(bytes);
		fileOutputStream.close();
		//System.out.println("success");

		FileInputStream fileInputStream=new FileInputStream("C:\\Users\\cks25\\OneDrive\\Desktop\\text.txt");
		//int read = fileInputStream.read();
		int i=0;
		while ((i=fileInputStream.read())!=-1) {
			System.out.print((char)i);

		}
//		System.out.println((char)read);
		//System.out.println("success read");

	}

}
