package br.com.motorola.arquivo;

public class LerArquivoConfiguracao {

	
	public static void main(String[] args) {
		
		String ArqConfig = "ConfiguracaoBD.con";
		
		String conteudo = Arquivo.Read(ArqConfig);
		String url = conteudo.split(";")[0];
		String login = conteudo.split(";")[1];
		String senha = conteudo.split(";")[2];
		
		System.out.println("url: " + url);
		System.out.println("Login: " + login);
		System.out.println("Senha: " + senha);
	}
}

