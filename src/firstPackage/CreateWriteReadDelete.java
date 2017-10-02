package firstPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateWriteReadDelete {

	public static void main(String []args) throws IOException{
		File dir = new File("C:\\selenium-workspace\\FirstProject\\temp2");
		dir.mkdir();
		File fil = new File("C:\\selenium-workspace\\FirstProject\\temp\\temp.txt");
		File fil2 = new File("C:\\selenium-workspace\\FirstProject\\temp2\\temp.txt");
		fil.createNewFile();
		fil2.createNewFile();
		
		System.out.println("temp.txt is a file :" + fil.isFile());
		
		//Writing to a File
		FileWriter fw = new FileWriter(fil);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("This is the first Line");
		bw.newLine();
		bw.write("This is the second Line");
		bw.close();
		
		//Reading from a File
		FileReader fr = new FileReader("C:\\selenium-workspace\\FirstProject\\temp\\temp.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine()); 
		while(!br.readLine().contentEquals(null)){
			System.out.println(br.readLine());
		}
		br.close();
		
	}
	
}
