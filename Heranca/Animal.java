package Heranca;

public abstract class Animal
{
	public static void main (String[] args)
	{
		
	}
	private  String TipoAnimal;

	public Animal (String tipoanimal)
	{
		this.TipoAnimal = tipoanimal;
	}
	
		abstract public void Nome (String nomeanimal);
		abstract public void Idade (int idadeanimal);
		abstract public void Som (String somanimal);
		
		public String getTipoAnimal()
		{
			return TipoAnimal;
		}
		
		public void setTipoAnimal(String tipoAnimal)
		{
			TipoAnimal = tipoAnimal;
		}
}
