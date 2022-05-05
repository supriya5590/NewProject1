//1.   Reading input from a   file and displaying it in the console
package SaturdayLabPractice;
import java.io.*;
public class LabQ1 {

	public static void main(String[] args) throws IOException {
		
		
		FileReader s= new FileReader("newData12.txt");
		int e;

		do
			{
			e= s.read();
			 System.out.print ((char)e);
			}
		while(e!=-1);
		
	}

}
