package first;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner n=new Scanner(System.in);
//		int num=n.nextInt();
		int flag=0;
		
		for(int i=2;i<=100;i++)
		{
			
			for(int j = 2;j<i;j++)
			{
				
				if(i%j==0)
				{
				    flag = 1;
					break;
				}
				
			
	
			}
			if(flag==0) 
			{
				System.out.println(i);
			}
			flag=0;
		}
		
		}

	}


