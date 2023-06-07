package br.com.motorola.teste;

import java.sql.Connection;import br.com.motorola.beans.Celular;
import br.com.motorola.conexao.Conexao;
import br.com.motorola.dao.CelularDAO;

public class CelularDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		
		CelularDAO celulardao = new CelularDAO(con);
		Celular celular = new Celular();
		
		celular.setModelo("MOTOROLA Z10 PLAY");
		
		celulardao.deletarCelular(celular);
		
		Conexao.fecharConexao(con);
			
			
		

	}

}
