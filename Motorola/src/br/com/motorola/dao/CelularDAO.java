package br.com.motorola.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import br.com.motorola.beans.Celular;

public class CelularDAO {

	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}
	
	public CelularDAO(Connection con) {
		setCon(con);
	}
	
	public String cadastrarCelular(Celular celular) {
		String sql = "insert into celular(modelo, peso, altura, largura) values (?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, celular.getModelo());
			ps.setDouble(2, celular.getPeso());
			ps.setDouble(3, celular.getAlturaDaTela());
			ps.setDouble(4, celular.getLarguraDaTela());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String deletarCelular(Celular celular) {
		String sql = "delete from celular where modelo = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, celular.getModelo());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso.";
			} else {
				return "Erro ao deletar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
