package Heranca;

public class AnimalQ1 
{
	int patas;
	private String revestimento;
	
	public void movimento()
	{
		System.out.println("Em movimento");
	}

	public int getPatas()
	{
		return patas;
	}
	
	public void setPatas(int patas)
	{
		this.patas = patas;
	}
	
	public String getRevestimento()
	{
		return revestimento;
	}
	
	public void setRevestimento(String revestimento)
	{
		this.revestimento= revestimento;
	}
}
