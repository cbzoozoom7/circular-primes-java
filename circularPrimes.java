//This only supports numbers between 100 and 1,000,000
import java.util.*;
import java.io.*;
public class circularPrimes {
	public static void main(String[] args) throws IOException {
		Scanner myScanner = new Scanner(new File("circularPrimes.dat"));
		int numberOfLines = myScanner.nextInt();
		for (int a=0; a<numberOfLines; a++) {
			int number = myScanner.nextInt();
			boolean prime = true;
			if (number<1000){
				for (int c=0;c<3;c++) {
					int tmpNumber;
					for (int b=2;b<number;b++) {
						if (number%b == 0) {
							prime = false;
						}
					}
					tmpNumber = (int) (number/10);
					number = (((number-(tmpNumber*10))*100)+tmpNumber);
				}
			} else if (number<10000) {
				for (int c=0;c<3;c++) {
					int tmpNumber;
					for (int b=2;b<number;b++) {
						if (number%b == 0) {
							prime = false;
						}
					}
					tmpNumber = (int) (number/10);
					number = (((number-(tmpNumber*10))*1000)+tmpNumber);
				}
			} else if (number<100000) {
				for (int c=0;c<3;c++) {
					int tmpNumber;
					for (int b=2;b<number;b++) {
						if (number%b == 0) {
							prime = false;
						}
					}
					tmpNumber = (int) (number/10);
					number = (((number-(tmpNumber*10))*10000)+tmpNumber);
				}
			} else {
				for (int c=0;c<3;c++) {
					int tmpNumber;
					for (int b=2;b<number;b++) {
						if (number%b == 0) {
							prime = false;
						}
					}
					tmpNumber = (int) (number/10);
					number = (((number-(tmpNumber*10))*10000)+tmpNumber);
				}
			}
			if (prime) {
				System.out.println("This number is prime, any way it rotates.");
			} else {
				System.out.println("This number isn't prime for at least one of its rotations.");
			}
		}
	}
}