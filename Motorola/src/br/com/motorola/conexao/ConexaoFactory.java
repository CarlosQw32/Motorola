package br.com.motorola.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.motorola.arquivo.Arquivo;

public class ConexaoFactory {
	public static void main(String[] args) throws SQLException {
		Connection conexao = null;

		String ArqConfig = "ConfiguracaoBD.con";		
		
		String conteudo = Arquivo.Read(ArqConfig);
		String url = conteudo.split(";")[0];
		String login = conteudo.split(";")[1];
		String senha = conteudo.split(";")[2];
		
		
		conexao = DriverManager.getConnection(url, login, senha);
		System.out.println("Abriu a conex�o");
		conexao.close();
	}
}
