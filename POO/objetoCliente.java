package POO;

public class objetoCliente 
{

	public static void main (String[] args)
	{
	
	//Instanciamento
	cliente pessoa = new cliente();
	
	//Definindo atributos
	pessoa.setNome("Fernanda");
	pessoa.setIdade(29);
	pessoa.setProfissao("estudante.");
	
	System.out.println("\nA pessoa se chama: "+pessoa.getNome()+
	", tem "+pessoa.getIdade()+" anos e é "+pessoa.getProfissao());
	}

}
