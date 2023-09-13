package first;

import java.util.*;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the Number");
		Scanner number=new Scanner(System.in);
		int n=number.nextInt();
		for(int i=1;i<=15;i++) {
			int j=n*i;
		System.out.println(i+ "*"+n+ "="+j);
	}

}
}
