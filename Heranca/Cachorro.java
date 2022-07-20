package Heranca;

public class Cachorro extends Animal
{
	public Cachorro()
	{
		super ("Cachorro");
	}
	
	@Override
	public void Nome (String nomeanimal)
	{
		System.out.println("O nome do cachorro é: "+nomeanimal);
	}
	
	@Override
	public void Idade (int idadeanimal)
	{
		System.out.println("Idade: "+idadeanimal);
	}
	
	@Override
	public void Som (String somanimal)
	{
		System.out.println("O som que seu cachorro emite é: "+somanimal);
	}
	
	public void Corre()
	{
		System.out.println("Uma das características do cachorro é correr!");
	}
}
