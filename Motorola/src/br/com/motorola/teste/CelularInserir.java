package br.com.motorola.teste;

import java.sql.Connection;


import br.com.motorla.bo.CelularBO;
import br.com.motorla.bo.Excecao;
import br.com.motorola.beans.Celular;
import br.com.motorola.conexao.Conexao;

public class CelularInserir {

	public static void main(String[] args)  throws Excecao {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		
		Celular celular = new Celular();		
		CelularBO celularbo = new CelularBO();
		
		celular.setModelo("MOTOROLA Z10 PLAY");
		celular.setPeso(250);
		celular.setAlturaDaTela(18.5);
		celular.setLarguraDaTela(9.2);
		
		celularbo.analisarModelo(celular);
		
		Conexao.fecharConexao(con);
	}

}
