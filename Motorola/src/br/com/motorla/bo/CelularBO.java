package br.com.motorla.bo;

import java.sql.Connection;

import br.com.motorola.beans.Celular;
import br.com.motorola.conexao.Conexao;
import br.com.motorola.dao.CelularDAO;

public class CelularBO  {

	Connection con = Conexao.abrirConexao();

	CelularDAO celulardao = new CelularDAO(con);

	public void analisarModelo(Celular celular) throws Excecao {
		if (celular.getModelo().length() <= 3) {
			System.out.println("O nome tem menos que três caracteres.");
		} else {
			celular.setModelo(celular.getModelo());
			celular.setModelo(celular.getModelo().toUpperCase());
			System.out.println(celulardao.cadastrarCelular(celular));
		}
	}
}
