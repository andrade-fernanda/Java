package PolimorfismoEHerança;

public interface figuras {
	
	public String nomeInterface = "Figuras";
	abstract public String  getNome();
	abstract public void setNome(String nome);
	public double getArea();
	public double getPerimetro();
	double getDiagonal();
	
	
	