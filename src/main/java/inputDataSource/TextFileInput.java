package inputDataSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileInput implements Input {
	
	private String input = "";

	@Override
	public String getInput() {
		return this.input;
	}

	@Override
	public void setInput(String... filePath) {
		File file = new File(filePath[0]);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				this.input += line;
				this.input += "\n";
			}
			br.close();
		
			} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Sorry, file not found");
			//e1.printStackTrace();
		}
	}


}
