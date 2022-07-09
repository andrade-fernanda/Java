package lacoDecisao;

import java.util.Scanner;

public class lacoDecisao3q 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

float idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextFloat();

	if (idade>=10 && idade<=14)
		{
			System.out.println("\nCategoria infantil");
		}

	else if (idade>=15 && idade<=17)
		{
			System.out.println("\nCategoria juvenil");
		}
	else if (idade>=18 && idade<=25)
		{
			System.out.println("\nCategoria adulto");
		}
	else if (idade<10 || idade>25)
		{
			System.out.println("\nCategoria indisponível.");
		}
	}
}
