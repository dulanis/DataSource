package inputDataSource;

import java.util.Scanner;

public class UserInput implements Input {

	private String input = "";
	
	@Override
	public String getInput() {
		return this.input;
	}

	@Override
	public void setInput(String... filePath) {
		this.input = filePath[0];
	}

}
