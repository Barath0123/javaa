package first;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner number=new Scanner(System.in);
		int n=number.nextInt();		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
		System.out.println();
		}
	}

}
