package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class ProgramTest {

	public static void main(String[] args) {

		Connection cnn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Statement st = null;

		
		/* Bloco de código para transações
		try {
			cnn = DB.getConnection();
			
			cnn.setAutoCommit(false);
			
			st = cnn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2") ;
			
			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);
			
			cnn.commit();
			
		} catch (SQLException e) {
			try {
				cnn.rollback(); // Refaz as alterações feitas
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException ex) {
				throw new DbException("Error trying to rollback! Cause by: " + ex.getMessage());
			}
		}
		
		*/
		
		/* Bloco de código usada para deletar elementos do banco de dados
		try {
			cnn = DB.getConnection();
			
			pst = cnn.prepareStatement("DELETE FROM department WHERE id = ?");
			
			pst.setInt(1, 5);
			
			int rowsAffected = pst.executeUpdate();
			
			System.out.println("Done ! Rows affected: " + rowsAffected);
			
			
		} catch (SQLException e) {
			e.fillInStackTrace();
			
		}finally {
			DB.closeConnection(cnn);
			DB.closeStatement(pst);
		}
		
		*/
		
		/* Código para atualizar a coluna de uma tabela 
		try {
			cnn = DB.getConnection();
			pst = cnn.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? "
					+ "WHERE (DepartmentId = ?)");
			
			pst.setDouble(1, 200.00);
			pst.setInt(2, 2);
			
			int rowsAffected = pst.executeUpdate();
			
			System.out.println("Done ! Rows affected: " + rowsAffected);
			
			
		} catch (SQLException e) {
			e.fillInStackTrace();
			
		}finally {
			DB.closeConnection(cnn);
			DB.closeStatement(pst);
		}
		
		*/
		
		/* Bloco de código para realizar a inserção de dados na tabela especificada
		try {

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String sql = "INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?,?,?,?,?)";
			cnn = DB.getConnection();
			pst = cnn.prepareStatement(sql, pst.RETURN_GENERATED_KEYS);

			pst.setString(1, "Carl Purple");
			pst.setString(2, "carlPurple@gmail.com");
			pst.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			pst.setDouble(4, 3000.0d);
			pst.setInt(5, 4);

			int rollsAffected = pst.executeUpdate();

			if (rollsAffected > 0) {
				rs = pst.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			}else {
				System.out.println("No row affectecd");
			}

		} catch (SQLException ex) {
			ex.fillInStackTrace();
		} catch (ParseException ex) {
			ex.fillInStackTrace();
		} finally {
			DB.closeConnection(cnn);
			DB.closeStatement(pst);
			DB.closeResultSet(rs);
		}
		
		*/

		/*
		 * Comandos para recuperação de dados try { cnn = DB.getConnection(); st =
		 * cnn.createStatement(); rs = st.executeQuery("SELECT * FROM seller"); while
		 * (rs.next()) { System.out.println(rs.getInt("Id") + ", " +
		 * rs.getString("Name") + ", " + rs.getString("Email") + ", " +
		 * rs.getString("BirthDate") + ", " + rs.getString("BirthDate") + ", " +
		 * rs.getString("BaseSalary") + ", " + rs.getString("DepartmentId")); } } catch
		 * (SQLException ex) { throw new DbException(ex.getMessage()); } finally {
		 * DB.closeConnection(cnn); DB.closeStatement(st); DB.closeResultSet(rs); }
		 */

	}
}