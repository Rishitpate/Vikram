package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_WriteTextFile {

	public static void main(String[] args) throws IOException {
		
		//File is a built in class of Java to create Files
		//Takes the argument "filepath", where the file will be, once created
		File f = new File("C:\\Testing\\temp.txt");
		
		//Method - createNewFile(); to create a new file
		f.createNewFile();
		
		//Write into text file
		FileWriter fw = new FileWriter("C:\\Testing\\temp.txt"); //FileWriter class creates an argument for BufferedWriter.
		BufferedWriter w = new BufferedWriter(fw); //BufferedWriter Class to actually write in the txt file, takes the object of FileWriter class as an argument.
		
		//Methods of BufferedWriter Class
		w.write("This is a 1st line");
		w.newLine();
		w.write("This is a 2nd line");
		w.newLine();
		w.write("This is a 3rd line");
		w.newLine();
		w.write("This is a 4th line");
		w.newLine();
		w.write("This is a 5th line");
		w.flush(); //All the above lines store into Java memory, .flush flushes it into the file provided in the FileWriter Class.
		
		//Read from Text File
		FileReader fr = new FileReader("C:\\Testing\\temp.txt");
		BufferedReader r = new BufferedReader(fr);
		
		/*System.out.println(r.readLine()); //Reads Line and set the pointer to the next line.
		System.out.println(r.readLine());
		System.out.println(r.readLine());
		System.out.println(r.readLine());
		System.out.println(r.readLine());
		System.out.println(r.readLine());//null
		System.out.println(r.readLine());//null*/
		
		int i = 0;
		String x;
		
		while((x = r.readLine())!= null) {
			System.out.println(x);
			i++;
		}
		
		System.out.println("The number of lines is:"+i);
		
		
	}

}
