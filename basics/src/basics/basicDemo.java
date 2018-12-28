package basics;

import java.util.Scanner;

public class basicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		Scanner in = new Scanner(System.in);
		
		// Multiplication table
		System.out.println("Enter the number:");
		int x=in.nextInt();
		for(int i=1;i<=10;i++){
		System.out.println(x+" * "+i+" = "+x*i);	
		}
		
		in.close();

	}

}
