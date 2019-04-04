package multiplicationTable;
import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		System.out.println("Choose a number to multiply with.");
		Scanner sc = new Scanner(System.in);
		int numberChooise = sc.nextInt();
		printMultiplicationTable(numberChooise);
	}
	
	
	public static void printMultiplicationTable(int num) {
		for(int i=1; i<=10; i++) {
			System.out.println(num*i);
		
		}
	}
		
		

	

}
