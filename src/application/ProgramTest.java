package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class ProgramTest {

	public static void main(String[] args) {

		Connection cnn = null;
		Statement st = null;
		ResultSet rs = null;

		
		/* Comandos para recuperação de dados
		try {
			cnn = DB.getConnection();
			st = cnn.createStatement();
			rs = st.executeQuery("SELECT * FROM seller");

			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name") + ", " + rs.getString("Email") + ", "
						+ rs.getString("BirthDate") + ", " + rs.getString("BirthDate") + ", "
						+ rs.getString("BaseSalary") + ", " + rs.getString("DepartmentId"));
			}
		} catch (SQLException ex) {
			throw new DbException(ex.getMessage());
		} finally {
			DB.closeConnection();
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		} */
	}
}
