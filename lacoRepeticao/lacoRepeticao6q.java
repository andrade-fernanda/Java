//Recebe numeros inteiros e imprime a media dos multiplos de 3. Programa para quando digita 0.
package lacoRepeticao;

import java.util.Scanner;

public class lacoRepeticao6q 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int n1,soma=0,cont=0;
		do
		{
			System.out.println("\nDigite um número: ");
			n1=ler.nextInt();
			if(n1%3==0 && n1!=0)
			{
				soma=soma+n1;
				cont++;
			}
		}while(n1!=0);
		
		System.out.println("\nA média dos múltiplos de 3 é: "+soma/cont);

	}

}
