package lacoDecisao;

import java.util.Scanner;

public class lacoDecisao1q 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

/*
		  
		
		 */
		
		int n1,n2,n3;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite um número: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite um número: ");
		n2 = leia.nextInt();
		System.out.println("\nDigite um número: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("\nO maior número é o: "+n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("\nO maior número é o: "+n2);
		}
		else if(n3>n2 && n3>n1)
		{
			System.out.println("\nO maior número é o: "+n3);
		}
	}

}
