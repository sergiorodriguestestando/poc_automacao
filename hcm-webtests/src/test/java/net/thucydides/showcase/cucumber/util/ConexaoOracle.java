package net.thucydides.showcase.cucumber.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConexaoOracle {

	static Connection conexao = null;

	
	
	public static Connection ObterConexao() {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conexao = DriverManager.getConnection("jdbc:oracle:thin:@mdbdev2db199.mdb.com.br:1523:satdev2.mdb.com.br","mdb_b2bic",
					"mdb_b2bic_dev");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return conexao;

	}

	public void FecharConexao() throws SQLException {
		conexao.close();
	}


}
