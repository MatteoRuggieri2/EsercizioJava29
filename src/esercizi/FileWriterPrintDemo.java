package esercizi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriterPrintDemo {
	
	final private String fileName = "src/text_files/print_writer_output.txt";

	public static void main(String[] args) {
		new FileWriterPrintDemo().run();
	}
	
	private void run() {
		
		File f = new File(fileName);
		
		try {
			PrintWriter pw = new PrintWriter(f);
			pw.print("string-1\n");
			pw.print("string-2\n");
			pw.println("this-is-period-1");
			pw.println("this-is-period-2");
			
			// Flush and close
			pw.flush();
			pw.close();
			
			System.out.println("Processo terminato con successo.");
			
		} catch (FileNotFoundException e) {
			System.err.println("Il file con path \"" + fileName + "\" non esiste.");
			e.printStackTrace();
		}
		
	}

}
