package first;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		int c=a+b;
		int n=10;
		for(int i=0;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
