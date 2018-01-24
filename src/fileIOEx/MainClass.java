package fileIOEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
	public static void main(String[] args) {
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\codeRepo\\workspace\\JavaReview\\example.txt");
			os = new FileOutputStream("C:\\codeRepo\\workspace\\JavaReview\\example_copy.txt");
			
			byte [] bs = new byte[5];
			
			while(true) {
				int i = is.read(bs);
				System.out.println("data : " + i );
				if(i == -1) break;
				os.write(bs, 0, i);
			}
			

			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(is != null)
					is.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if(os != null)
					os.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}
}
