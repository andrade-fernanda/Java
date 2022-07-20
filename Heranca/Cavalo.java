package Heranca;

public class Cavalo extends Animal
{
	public Cavalo()
	{
		super("Cachorro");
	}
	
	@Override
	public void Nome (String nomeanimal)
	{
		System.out.println("O nome do cavalo é: "+nomeanimal);
	}
	
	@Override
	public void Idade(int idadeanimal)
	{
		System.out.println("Idade: "+idadeanimal);
	}
	
	@Override
	public void Som (String somanimal)
	{
		System.out.println("O som que seu cavalo emite é: "+somanimal);
	}
	
	public void Corre()
	{
		System.out.println("Uma das características do cavalo é correr!");
	}
}
