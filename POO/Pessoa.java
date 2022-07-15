// Prática referente ao vídeo 15 da plataforma
package POO;

// Classe Pessoa e atributos (Private)
public class Pessoa 
{
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	// Construtor; precisa ter mesmo nome da classe + parâmetros do construtor
	public Pessoa (String primeiro, String meio, String ultimo)
	{
		primeiroNome=primeiro;
		ultimoNome=ultimo;
		nomesDoMeio=meio;
	}
	
	// Método
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+ " "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
}
