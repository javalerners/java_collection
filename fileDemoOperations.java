package FileDemoOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileDemoOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fl=new File("D:\\FileDemo\\testing.txt");
		
		if(fl.createNewFile()) {
			System.out.println("file alredy present at that location");
			System.out.println("file name : "+fl.getName());
			System.out.println("can read the file : "+fl.canRead());
			System.out.println("can write the contents into the file : "+fl.canWrite());
		}
		System.out.println("---------------&&&&----------------");
		System.out.println("file write operation");
		
		if(fl.exists()) {
			
			FileWriter fw=new FileWriter(fl);
			fw.write("Hellow world!! , I am a jobito student");
			fw.close();	
		}
		System.out.println("---------------&&&&----------------");
		System.out.println("file read operation");
		
		Scanner sc=new Scanner(fl);
		
		while(sc.hasNextLine()) {
			String nm=sc.nextLine();
			System.out.println(nm);
		}
		System.out.println("---------------&&&&----------------");
		System.out.println("file delete operation");
		
		fl.deleteOnExit();
		if(fl.delete()) {
			System.out.println("file deleted");
		}else {
			System.out.println("file not deleted");
		}	
	}

}
