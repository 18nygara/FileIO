package main;
import java.util.ArrayList;
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
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int i =0;
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
			int value = Integer.parseInt(input.nextLine());
			total+=value;
			numbers.add(value);
			
			
		}
		
		for (Integer x: numbers) {
			if (((int)x)%2==0) {
				System.out.println("Even number: " + x);
			}
			if (((int)x)%2!=0) {
				System.out.println("Odd number: " + x);
			}
		}
	
				
	}
}
