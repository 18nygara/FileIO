package main;
import java.io.*;
import java.util.Scanner;
public class FileIO {
	public static void main(String[] args) throws NullPointerException{
		Scanner in = new Scanner(System.in);
		System.out.println("Hello World");
		
		System.out.println("Filename:");
		String fname = in.nextLine();
		
		File inFile = new File("src/main/"+fname+".txt");
		Scanner input = null;
		try {
			input = new Scanner(inFile);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			
			e.printStackTrace();
		}
		
		int total = 0;
		while(input.hasNext()) {
			total+=Integer.parseInt(input.nextLine());
		}
		
		System.out.println("Total: "+ total);
		
		System.out.println("Displaying all numbers divisible by 3...");
		
		String check = "";
		
		try {
			input = new Scanner(inFile);
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist.");
			e.printStackTrace();
		}
		
		while (input.hasNext()) {
			check = input.nextLine();
			if (Integer.parseInt(check) % 3 == 0) {
				System.out.println(check);
			}
		}
	}
}
