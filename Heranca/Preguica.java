package Heranca;

public class Preguica extends Animal
{
	public Preguica()
	{
		super("Cachorro");
	}
	
	@Override
	public void Nome (String nomeanimal)
	{
		System.out.println("O nome da preguiça é: "+nomeanimal);
	}
	
	@Override
	public void Idade (int idadeanimal)
	{
		System.out.println("Idade: "+idadeanimal);
	}
	
	@Override
	public void Som (String somanimal)
	{
		System.out.println("O som que a preguiça emite é: "+somanimal);
	}
	
	public void SubirArvores() 
	{
		System.out.println("Uma das características da preguiça é subir em árvores!");
	}
}

