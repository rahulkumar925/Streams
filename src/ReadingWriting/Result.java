package ReadingWriting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//Design a java application to generate 100 random numbers between 1 and 49 and write them in a text file named boy.txt
//one number per line. Then read the 100 integers from that file and placed them into a java collection 
public class Result {

	public static void main(String[] args) {

		try {
			writeBoy();
			readBoy();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	// Method to write numbers.
	private static void writeBoy() throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\rkuma246\\Desktop\\Boy.txt");
		BufferedWriter writer = new BufferedWriter(fw);

		for (int i = 0; i < 100; i++) {
			int x = (int) (((Math.random() * 1000) % 100) + 1);
			writer.write(x + "\r\n");
		}
		writer.close();
	}

	// Method to read numbers.
	private static void readBoy() throws NumberFormatException, IOException {
		FileReader fr = new FileReader("C:\\Users\\rkuma246\\Desktop\\Boy.txt");
		BufferedReader reader = new BufferedReader(fr);

		// Creating list.
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(Integer.valueOf(reader.readLine())); // Adding numbers to list
		}

		reader.close();

		// Printing list.
		list.stream().distinct().sorted().forEach(System.out::println);
	}
}
