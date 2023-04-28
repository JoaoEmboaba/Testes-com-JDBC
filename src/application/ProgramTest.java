package application;

import java.sql.Connection;

import db.DB;

public class ProgramTest {

	public static void main(String[] args) {

		Connection cnn = DB.getConnection();
		if (cnn != null) {
			System.out.println("Deu certo!");
		}

		DB.closeConnection();

	}
}
