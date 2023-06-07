package br.com.motorola.arquivo;


public class CriarArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ArqConfig = "ConfiguracaoBD.con";
		
		String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
		String login = "rm97385";
		String senha = "050801";
		
		String print = url+";"+login+";"+senha;
		Arquivo.Write(ArqConfig,print);
		
		System.out.println("Arquivo criado");
	}
}