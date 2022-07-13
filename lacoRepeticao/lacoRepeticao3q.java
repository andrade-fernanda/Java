//Solicita idades e imprime quem é menor de 21 e maior que 50. Programa termina quando idade -99

package lacoRepeticao;

 import java.util.Scanner;
 
public class lacoRepeticao3q 
{

	public static void main(String[] args) 
	{
		int menorvinteum=0,maiorcinquenta=0,idade;
		Scanner ler = new Scanner(System.in);
		System.out.print("\nDigite sua idade:");
		idade=ler.nextInt();
		while(idade!=-99)
		{
			if(idade<21)
			{	
				menorvinteum++;
			}
			if(idade>50)
				maiorcinquenta++;
			System.out.print("\nDigite sua idade:");
			idade=ler.nextInt();
		}
		System.out.println("\nO total de pessoas com menos de 21 é: "+menorvinteum);
		System.out.println("\nO total de pessoas com mais de 50 é: "+maiorcinquenta);
	}

}
