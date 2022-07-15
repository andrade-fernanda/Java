package RevisaoPoo;

public class testeAutomovel {

	public static void main(String[] args) {
		
		//Instanciar um objeto da classe Automovel
		Automovel auto = new Automovel("Elisabeth Cavancante","Land Rover","JAVA1992",2023);
		
		auto.imprimirInfo();
		
		System.out.println("\n********Transferência de proprietária********");
		auto.setNomeProprietario("Luana Nascimento");
		auto.imprimirInfo();
		auto.setPlaca("POO2022");
		auto.imprimirInfo();

		// quando criamos um private, apenas métodos da própria classe podem alterar os atributos
	}

}
