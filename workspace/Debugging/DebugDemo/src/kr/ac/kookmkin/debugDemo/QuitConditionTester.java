package kr.ac.kookmkin.debugDemo;

import java.io.*;

public class QuitConditionTester {

	public static void main(String[] args) throws IOException {
		BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
		String s;
		String quit = new String("Quit");
		while (true) {
			System.out.println("Enter any string. To quit, type Quit");
			s = new String(bufReader.readLine());
			if (s.equals(quit)) {
				System.out.println("Goodbye");
				System.exit(0);
			} else {
				System.out.println("You typed \"" + s + "\"!");
			}
		}
	}

}
