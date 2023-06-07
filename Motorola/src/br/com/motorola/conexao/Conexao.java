package br.com.motorola.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.motorola.arquivo.Arquivo;



public class Conexao {
	
	public static Connection abrirConexao() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
						
			String ArqConfig = "ConfiguracaoBD.con";		
			
			String conteudo = Arquivo.Read(ArqConfig);
			String url = conteudo.split(";")[0];
			String login = conteudo.split(";")[1];
			String senha = conteudo.split(";")[2];
			
			con = DriverManager.getConnection(url, login,senha );
			System.out.println("Conexao aberta");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + "Erro no envio dos dados");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "Erro no envio dos dados");
		} catch (Exception e) {
			System.out.println(e.getMessage() + "Erro no envio dos dados");
		}
		return con;
	}
	
	public static void fecharConexao(Connection con) {
		try {
			con.close();
			System.out.println("Conex�o fechada");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " Erro para fechar");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " Erro para fechar");
		}
	}
}
