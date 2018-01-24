package fileIOEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\codeRepo\\workspace\\JavaReview\\example.txt");
			while(true) {
				int i = is.read();
				System.out.println("data : " + i );
				if(i == -1) break;
			}
			
			OutputStream os = new FileOutputStream("C:\\codeRepo\\workspace\\JavaReview\\example.txt");
			String str = "hello world";
			byte[] bs = str.getBytes();
			os.write(bs);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
