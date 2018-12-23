package tuan.com.studyandshare;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Demo {
	public static void main(String[] args) throws IOException  {
		
		String data ="data/TUAN-TESTDATA.txt";
		
//		String data ="data/New Text Document.txt";
		

		FileReader fr = new FileReader(data);
		
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		
		if(br.readLine() == null) {
			System.out.println("No data");
			
		}
		else {
			
			fr = new FileReader(data);
			br = new BufferedReader(fr);
			
		int i = 0;
		while((line = br.readLine()).equals("")) {
			i ++;
			System.out.println("Gia tri: "+ i);
		}
		int a = Integer.parseInt(line);
		System.out.println(a);
			
		}
		
	}

}
