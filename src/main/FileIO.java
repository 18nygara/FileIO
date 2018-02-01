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
		int count = 0;
		while(input.hasNext()) {
			String curr = input.nextLine();
			total+=Integer.parseInt(curr);
			count++;
			if(count == 5)
			{
				System.out.println("Fifth number is: "+curr);
				count = 0;
			}
		}
		
		System.out.println("Total: "+ total);
				
	}
}
