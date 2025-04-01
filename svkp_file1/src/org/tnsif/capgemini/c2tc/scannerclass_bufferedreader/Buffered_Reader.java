package org.tnsif.capgemini.c2tc.scannerclass_bufferedreader;
import java.io.BufferedReader;
import java.io.FileReader;
public class Buffered_Reader {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\hp\\Documents\\keerthi.txt"));
		String data=" ";
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		br.close();
	}

}