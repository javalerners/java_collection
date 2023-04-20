package FileDemoOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileInputOutputStreenDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("D:\\FileDemo\\fileInputOutputStreemDemo.txt");
		
		String a="Hello world!! , I am a Jobito Student";
		byte[] by=a.getBytes();
		fos.write(by);
		fos.close();
		
		FileInputStream fis = new FileInputStream("D:\\FileDemo\\fileInputOutputStreemDemo.txt");
			int endoffile=0;
			while((endoffile=fis.read())!=-1) {
				
				System.out.print((char)endoffile);
			}
		
	}

}
