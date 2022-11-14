package net.thucydides.showcase.cucumber.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class mdb_b2bbic extends ConexaoOracle {
	Connection conexao;
	Statement statement;
	ResultSet resultSet;

	public void AbrirConexao() throws SQLException {
		conexao = ObterConexao();
		statement = conexao.createStatement();

	}

	public String _001_ValidandoDataSincronismo(String pedido) throws SQLException {
		String dataConvertida = "";
		String sql = "SELECT C.DAT_SINCRONISMO_PEDIDO FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL C WHERE C.NUM_PEDIDO_COMERCIAL ="
				+ pedido;
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			Timestamp dataSincronismoPedido = resultSet.getTimestamp("DAT_SINCRONISMO_PEDIDO");

		}

		return dataConvertida;
	}

	public void FecharConexao() throws SQLException {

		statement.close();
		conexao.close();

	}

	public static void main(String[] args) throws SQLException {
		mdb_b2bbic m = new mdb_b2bbic();
		m.AbrirConexao();
	}

}
