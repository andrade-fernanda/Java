package PolimorfismoEHerança;

public class Celular extends exemploTelefone
{
 
	public Celular() 
	{
		super("Telefone Celular");
		
		
	}
	@Override
	public void toca(int codigoToque) 
	{
		switch(codigoToque) {
		case 1:
			System.out.println("\nHello Motor!");
			break;
		case 2:
			System.out.println("\nTanana...Tanana");
			break;
			default:
				System.out.println("\nParara...parara");
				
		}
	}
	@Override //Transforma em método polimórfico
	public void disca(String numero)
	{
		System.out.println("\nO número "+numero+" é um celular!!!");
	}
}

